package com.employee.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    void deleteEmplyeeById(Long id);
    Employee findEmployeeById(Long id);
}
