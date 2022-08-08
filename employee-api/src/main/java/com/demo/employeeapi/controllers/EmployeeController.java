package com.demo.employeeapi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.employeeapi.entities.Employee;
import com.demo.employeeapi.services.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<?> getAllEmployees() {
        List<Employee> list = employeeService.getAllEmployees();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
