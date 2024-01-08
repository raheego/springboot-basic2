package com.test.departmentService.service;

import com.test.departmentService.entity.Department;

public interface DepartmentService {

    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);
}
