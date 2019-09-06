package com.spring.exporttable.service;

import com.spring.exporttable.model.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(long id);

}
