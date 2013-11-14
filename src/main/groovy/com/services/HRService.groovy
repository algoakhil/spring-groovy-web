package com.services

import com.models.Department
import com.models.Employee
import com.repositories.DepartmentRepository
import com.repositories.EmployeeRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import javax.inject.Inject

/**
 * User: Akhil Shastri
 * Date: 11/14/13
 * Time: 12:35 PM
 */
@Service
@Transactional
class HRService {
    @Inject
    DepartmentRepository deptRepo
    @Inject
    EmployeeRepository empRepo

    Iterable<Department> getAllDepartments() {
        deptRepo.findAll()
    }

    Iterable<Employee> getAllEmployees() {
        empRepo.findAll()
    }

    Employee addEmployee(Employee employee) {
        empRepo.save(employee)
    }
}
