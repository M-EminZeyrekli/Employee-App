package com.demo.employeeapi.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.demo.employeeapi.entities.Employee;
import com.demo.employeeapi.repositories.EmployeeRepository;
import com.demo.employeeapi.services.Abstract.EmployeeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // final nesnelerden contructor oluşturur.
public class EmployeeServiceImp implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> list = employeeRepository.findAll();
        return list;

    }

    @Override
    public Employee getOneEmployee(int id) {
        Employee employee = employeeRepository.findById(id).orElseThrow();
        return employee;
    }

    @Override
    public Employee postOneEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }

    @Override
    public Employee putOneEmployee(int id, Employee employee) {
        getOneEmployee(id);
        employee.setId(id);
        employeeRepository.save(employee);
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteOneEmployee(int id) {
        getOneEmployee(id);
        employeeRepository.deleteById(id);

    }

}