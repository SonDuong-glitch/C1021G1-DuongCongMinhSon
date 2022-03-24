package com.example.demo.controller.employee;

import com.example.demo.dto.CustomerDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.person.customer.Customer;
import com.example.demo.model.person.customer.CustomerType;
import com.example.demo.model.person.employee.Employee;
import com.example.demo.model.person.employee.EmployeeDivision;
import com.example.demo.model.person.employee.EmployeeEducationDegree;
import com.example.demo.model.person.employee.EmployeePosition;
import com.example.demo.service.employee_service.IDivisionService;
import com.example.demo.service.employee_service.IEducationService;
import com.example.demo.service.employee_service.IEmployeeService;
import com.example.demo.service.employee_service.IPositionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;


@Controller
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;
    @Autowired
    private IDivisionService iDivisionService;
    @Autowired
    private IPositionService iPositionService;
    @Autowired
    private IEducationService iEducationService;
    @GetMapping("/showListEmployee")
    public String listAll(Model model, Pageable pageable){
        Page<Employee> employees = iEmployeeService.findAll(pageable);
        model.addAttribute("employees",employees);
        return "employee/listEmployee";
    }
    @GetMapping("showCreateFormEmployee")
    public String createEmployee(Model model){
        List<EmployeeDivision> employeeDivisions = iDivisionService.findAll();
        List<EmployeePosition> employeePositions = iPositionService.findAll();
        List<EmployeeEducationDegree> employeeEducationDegrees = iEducationService.findAll();
        model.addAttribute("divisions", employeeDivisions);
        model.addAttribute("positions", employeePositions);
        model.addAttribute("educations",employeeEducationDegrees);
        model.addAttribute("employeeDto", new EmployeeDto());
        return "employee/inputFormEmployee";
    }
    @PostMapping("/createEmployee")
    public String createEmployee(@ModelAttribute @Validated EmployeeDto employeeDto , BindingResult bindingResult, Model model){
        new EmployeeDto().validate(employeeDto,bindingResult);
        if (bindingResult.hasFieldErrors()){
            List<EmployeeEducationDegree> employeeEducationDegrees = iEducationService.findAll();
            List<EmployeeDivision> employeeDivisions = iDivisionService.findAll();
            List<EmployeePosition> employeePositions = iPositionService.findAll();
            model.addAttribute("degrees",employeeEducationDegrees);
            model.addAttribute("divisions",employeeDivisions);
            model.addAttribute("positions",employeePositions);
            return "employee/inputFormEmployee";
        }else {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeDto,employee);
            model.addAttribute("message", "Thêm mới thành  công");
            iEmployeeService.save(employee);
        }
        return "redirect:/showListEmployee";
    }
    @GetMapping("/showEditFormEmployee/{id}")
    public String formEdit(@PathVariable Long id , Model model){
        List<EmployeeEducationDegree> employeeEducationDegrees = iEducationService.findAll();
        List<EmployeeDivision> employeeDivisions = iDivisionService.findAll();
        List<EmployeePosition> employeePositions = iPositionService.findAll();
        Employee employee =  iEmployeeService.findById(id);
        EmployeeDto employeeDto = new EmployeeDto();
        BeanUtils.copyProperties(employee,employeeDto);
        model.addAttribute("degrees",employeeEducationDegrees);
        model.addAttribute("divisions",employeeDivisions);
        model.addAttribute("positions",employeePositions);
        model.addAttribute("employeeDto",employeeDto);
        return "employee/editFormEmployee";
    }
    @PostMapping("/editEmployee")
    public String editComplete(@Valid @ModelAttribute EmployeeDto employeeDto){
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto,employee);
        employee.setIdEmployee(employeeDto.getIdEmployee());
        iEmployeeService.save(employee);
        return "redirect:/showListEmployee";
    }
    @GetMapping("/deleteEmployee")
    public String delete(RedirectAttributes redirectAttributes,@PathVariable Long id){
        Employee employee = iEmployeeService.findById(id);
        iEmployeeService.remove(employee);
        redirectAttributes.addFlashAttribute("message","Xóa Thành Công");
        return "redirect:/showListEmployee";
    }
}
