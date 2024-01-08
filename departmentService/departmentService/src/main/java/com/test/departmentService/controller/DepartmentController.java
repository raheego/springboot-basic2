package com.test.departmentService.controller;

import com.test.departmentService.entity.Department;
import com.test.departmentService.service.DepartmentService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dept")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService; // data관련하여 처리해야하니 service

    @PostMapping //http:localhostL8081/api/dept
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {
        Department saveDepartment = departmentService.saveDepartment(department);

        return new ResponseEntity<>(saveDepartment, HttpStatus.OK);
    }


    @GetMapping("{id}") //http:localhostL8081/api/dept/1
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long departmentId){
        Department department = departmentService.getDepartmentById(departmentId);
        return ResponseEntity.ok(department);
    }
}
