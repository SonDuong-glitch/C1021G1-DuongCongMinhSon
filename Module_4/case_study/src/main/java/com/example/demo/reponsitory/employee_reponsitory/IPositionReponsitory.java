package com.example.demo.reponsitory.employee_reponsitory;

import com.example.demo.model.person.employee.EmployeePosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPositionReponsitory extends JpaRepository<EmployeePosition,Long> {
}
