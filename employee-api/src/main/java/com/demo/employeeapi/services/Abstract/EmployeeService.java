package com.demo.employeeapi.services.Abstract;

import java.util.List;

import com.demo.employeeapi.entities.Employee;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public Employee getOneEmployee(int id);

    public Employee postOneEmployee(Employee employee);

    public Employee putOneEmployee(int id, Employee employee);

    public void deleteOneEmployee(int id);

}
