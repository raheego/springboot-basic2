package com.test.demo.service;

import com.test.demo.entity.Employee;
import com.test.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployeeAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(String employeeId) {
        return employeeRepository.findById(employeeId)
//                .orElseThrow() 예외처리
                .orElse(null);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(String employeeId, Employee employee) {
        Employee employeeFindId =  employeeRepository.findById(employeeId).orElse(null); //찾았는데 없다면 NULL처리

        //가져와서 셋팅
        employeeFindId.setEmployeeName(employee.getEmployeeName());
        employeeFindId.setSalayry(employee.getSalayry());

        return employeeFindId;
    }

    @Override
    public void deleteEmployee(String employeeId) {
        employeeRepository.deleteById(employeeId);
    }
    /*
@Override
public Employee updateEmployee(String employeeId, EmployeeUpdateDTO employee) {

    Employee existedEmployee = employeeRepository.findById(employeeId).orElse(null);
    existedEmployee.setEmployeeName(employee.getEmployeeName());
    existedEmployee.setSalary(employee.getSalary());
    employeeRepository.save(existedEmployee);
    return existedEmployee;
}
    */


}
