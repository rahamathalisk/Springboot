package com.employee.employee;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeNo(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }
    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee){
       return employeeRepo.save(employee);
    }

    public void deleteEmployee(Employee employee){
        employeeRepo.delete(employee);
    }

    public void deleteEmployeeById(Long id){
        employeeRepo.deleteEmplyeeById(id);
    }

    public Employee findEmployeeById(Long id){
        return  employeeRepo.findEmployeeById(id);
    }
}
