package com.techiecookie.cn.service.impl;

import com.techiecookie.cn.entity.Employee;
import com.techiecookie.cn.repository.EmployeeRepository;
import com.techiecookie.cn.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee findEmployeeById(long id) {
        return employeeRepository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("Employee Not Found !!");
        });
    }
}
