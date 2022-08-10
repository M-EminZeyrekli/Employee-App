package com.demo.employeeapi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.employeeapi.entities.Employee;
import com.demo.employeeapi.services.EmployeeServiceImp;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeServiceImp employeeService;

    @GetMapping
    public ResponseEntity<?> getAllEmployees() {
        List<Employee> list = employeeService.getAllEmployees();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOneEmployee(@PathVariable int id) {
        Employee employee = employeeService.getOneEmployee(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> postOneEmployee(@RequestBody Employee employee) {
        Employee employeeadded = employeeService.postOneEmployee(employee);
        return new ResponseEntity<>(employeeadded, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> putOneEmployee(@PathVariable int id, @RequestBody Employee employee) {
        Employee employeeupdated = employeeService.putOneEmployee(id, employee);
        return new ResponseEntity<>(employeeupdated, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteOneEmployee(@PathVariable int id) {
        employeeService.deleteOneEmployee(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
