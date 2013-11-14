package com.models

import javax.persistence.Column
import javax.persistence.Entity

/**
 * User: Akhil Shastri
 * Date: 11/14/13
 * Time: 11:19 AM
 */
@Entity
class Employee extends AbstractModel {

    @Column(unique = true, nullable = false)
    String code

    @Column(nullable = false)
    String name

    Department department

    @Column(unique = true)
    EmailAddress emailAddress;

}
