package com.example.demo.controller.service;

import com.example.demo.dto.ServiceDto;
import com.example.demo.model.service.RentType;
import com.example.demo.model.service.Service;
import com.example.demo.model.service.ServiceType;
import com.example.demo.service.service_service.IRentTypeService;
import com.example.demo.service.service_service.IServiceService;
import com.example.demo.service.service_service.IServiceTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ServiceController {
    @Autowired
    private IRentTypeService iRentTypeService;
    @Autowired
    private IServiceService iServiceService;
    @Autowired
    private IServiceTypeService iServiceTypeService;
    @GetMapping("listService")
    public String findAllService(@PageableDefault(value = 5)Pageable pageable, Model model){
        Page<Service> services = iServiceService.findAllService(pageable);
        if(services == null){
            model.addAttribute("message", "Danh sách hiện đang trống, bạn vui lòng thêm vào");
        }
        model.addAttribute("services",services);
        return "service/listService";
    }
    @GetMapping("showCreateFormService")
    public String showCreateFormService(Model model){
        List<RentType> rentTypeList = iRentTypeService.findAll();
        List<ServiceType> serviceTypes = iServiceTypeService.findAll();
        model.addAttribute("service", new ServiceDto());
        model.addAttribute("rentTypeList", rentTypeList);
        model.addAttribute("serviceTypes",serviceTypes);
        return "service/createFormService";
    }
    @PostMapping("submitFormCreateService")
    public String submitFormCreateService(@ModelAttribute @Validated ServiceDto serviceDto , BindingResult bindingResult, Model model) {
        new ServiceDto().validate(serviceDto, bindingResult);
        if(bindingResult.hasFieldErrors()){
            List<RentType> rentTypeList = iRentTypeService.findAll();
            List<ServiceType> serviceTypes = iServiceTypeService.findAll();
            model.addAttribute("rentTypeList", rentTypeList);
            model.addAttribute("serviceTypes",serviceTypes);
            return "service/createFormService";
        }else{
            Service service = new Service();
            BeanUtils.copyProperties(serviceDto,service);
            model.addAttribute("service",service);
            return "service/listService";
        }
    }
}
