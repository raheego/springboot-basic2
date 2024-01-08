package com.test.demo.repository;

import com.test.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,String> { //employee table의 id값

}
