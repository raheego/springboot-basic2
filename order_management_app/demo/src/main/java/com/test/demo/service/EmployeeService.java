package com.test.demo.service;

import com.test.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployeeAll();

    Employee getEmployeeById(String employeeId);

    Employee saveEmployee(Employee employee);

    Employee updateEmployee(String employeeId, Employee employee);

    void deleteEmployee(String employeeId);
}
