package com.repositories

import com.models.Employee
import org.springframework.data.repository.CrudRepository

/**
 * User: Akhil Shastri
 * Date: 11/14/13
 * Time: 12:23 PM
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}