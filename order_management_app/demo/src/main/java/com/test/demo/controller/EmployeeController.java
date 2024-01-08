package com.test.demo.controller;

import com.test.demo.entity.Employee;
import com.test.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // http rest
@RequestMapping("api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService; // crud 구문 다 갖고 있는 service, 부모격인 것을 데려옴

    @GetMapping
    public List<Employee> getEmployeeAll(){
        return employeeService.getEmployeeAll();
    }


    // 이것도 가능
    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
       return employeeService.saveEmployee(employee);
    }
/*
    @PostMapping("/save")
    public String saveEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee.saveEmployee() + "저장되었습니다.";
    }
*/
    //@PathVariable 직원의 ID는 경로에서 추출되고,
    // @RequestBody 업데이트할 직원의 정보는 HTTP 요청 본문(@RequestBody)에서 받게 됩니다
    @PostMapping("/update/{employeeId}")
    public Employee updateEmployee(@PathVariable String employeeId, @RequestBody Employee employee) {
        return employeeService.updateEmployee(employeeId, employee);
    }

    @PostMapping("/delete")
    public void deleteEmployee(@RequestBody String employeeId){
        employeeService.deleteEmployee(employeeId);
    }
}
