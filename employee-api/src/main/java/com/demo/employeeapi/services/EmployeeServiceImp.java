package com.demo.employeeapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.employeeapi.entities.Employee;
import com.demo.employeeapi.repositories.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor //final nesnelerden contructor oluşturur.
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

   public List<Employee> getAllEmployees(){
        List<Employee> list = employeeRepository.findAll();
        return list;     

    }

}