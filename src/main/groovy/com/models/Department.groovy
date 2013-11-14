package com.models

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.JoinColumn
import javax.persistence.OneToMany

/**
 * User: Akhil Shastri
 * Date: 11/14/13
 * Time: 11:18 AM
 */
class Department extends AbstractModel {

    @Column(unique = true, nullable = false)
    String code

    @Column(nullable = false)
    String name

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "department_id")
    Set<Employee> employees = new HashSet<Employee>();
}
