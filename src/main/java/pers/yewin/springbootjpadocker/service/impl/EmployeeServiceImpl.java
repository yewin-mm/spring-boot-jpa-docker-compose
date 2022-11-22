package pers.yewin.springbootjpadocker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.yewin.springbootjpadocker.entity.Employee;
import pers.yewin.springbootjpadocker.repository.EmployeeRepository;
import pers.yewin.springbootjpadocker.service.EmployeeService;

import java.util.List;

/**
 * @author: Ye Win
 * @created: 01/11/2022
 * @project: spring-boot-jpa-docker
 * @package: pers.yewin.springbootjpadocker.service.impl
 */

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getById(long id) {
        // JPA build in method query return as Optional value.
        // add .get to pull data from Optional and cast with Employee Object as Optional<T> don't know exact data type which are in Optional if you don't declare type in Optional.
        return (Employee) employeeRepository.findById(id).get();
    }

    /**
     * I don't add any other APIs because this is demo project for spring boot jpa and running as container to connect to containerize db.
     */
}
