package com.techiecookie.cn.controller;

import com.techiecookie.cn.entity.Employee;
import com.techiecookie.cn.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/employee")
@RequiredArgsConstructor
public class EmployeeControllerV2 {

    private final EmployeeService employeeService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Employee> findEmployee(@PathVariable long id) {
        return ResponseEntity.ok(employeeService.findEmployeeById(id));
    }
}
