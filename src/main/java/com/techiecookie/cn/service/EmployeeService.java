package com.techiecookie.cn.service;

import com.techiecookie.cn.entity.Employee;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    Employee findEmployeeById(long id);
}
