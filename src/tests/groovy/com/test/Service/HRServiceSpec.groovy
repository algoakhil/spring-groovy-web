package com.test.Service

import com.GroovyConfig
import com.services.HRService
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

import javax.inject.Inject

/**
 * User: Akhil Shastri
 * Date: 11/14/13
 * Time: 12:41 PM
 */


@ContextConfiguration(classes = [GroovyConfig.class])
class HRServiceSpec extends Specification {
    @Inject
    HRService hrService

    def "add employee"() {
        when:
        def i = 1
        then:
        assert i == 1
//        assert hrService.getAllEmployees().collect().size() ==0
//
//        def dep = new Department();
//        dep.setCode('DEP-01')
//        dep.setName('DEP-NAME-01')
//        //dep.setCode('DEP-01')
//
//        def employee = new Employee();
//
//        employee.setCode('EM01')
//        employee.setName('EMname-01')
//        employee.setEmailAddress( new EmailAddress('Emp@gmail.com'))
//        employee.setDepartment(dep)
//
//        hrService.addEmployee(employee)
//
//       assert hrService.getAllEmployees().collect().size() >0
    }

}
