package com.spring.exporttable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.spring.exporttable.model.Employee;
import com.spring.exporttable.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {


    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id){
        return employeeRepository.getOne(id);
    }

}
