package com.demo.employeeapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.employeeapi.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
