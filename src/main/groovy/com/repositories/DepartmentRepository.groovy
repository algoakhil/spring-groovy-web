package com.repositories

import com.models.Department
import org.springframework.data.repository.CrudRepository

/**
 * User: Akhil Shastri
 * Date: 11/14/13
 * Time: 12:20 PM
 */
interface DepartmentRepository extends CrudRepository<Department, Long> {

}
