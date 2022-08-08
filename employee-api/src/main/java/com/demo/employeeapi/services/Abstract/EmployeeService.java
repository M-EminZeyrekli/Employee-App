package com.demo.employeeapi.services.Abstract;

import java.util.List;

import com.demo.employeeapi.entities.Employee;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public Employee getOneEmployee();

    public Employee postOneEmployee();

    public Employee putOneEmployee(int id);

    public void deleteOneEmployee(int id);

}
