package com.test.departmentService.repository;

import com.test.departmentService.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> { //deptId type 쓰기,

}
