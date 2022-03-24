package com.example.demo.reponsitory.employee_reponsitory;

import com.example.demo.model.person.employee.EmployeeDivision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDivisionReponsitory extends JpaRepository<EmployeeDivision,Long> {
}
