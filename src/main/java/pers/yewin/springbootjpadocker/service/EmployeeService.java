package pers.yewin.springbootjpadocker.service;

import pers.yewin.springbootjpadocker.entity.Employee;

import java.util.List;

/**
 * @author: Ye Win
 * @created: 01/11/2022
 * @project: spring-boot-jpa-docker
 * @package: pers.yewin.springbootjpadocker.service
 */

public interface EmployeeService {

    void saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getById(long id);

    /**
     * I don't add any other APIs because this is demo project for spring boot jpa and running as container to connect to containerize db.
     */
}
