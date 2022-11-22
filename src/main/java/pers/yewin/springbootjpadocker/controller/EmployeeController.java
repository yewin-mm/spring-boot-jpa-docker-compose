package pers.yewin.springbootjpadocker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pers.yewin.springbootjpadocker.entity.Employee;
import pers.yewin.springbootjpadocker.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Ye Win
 * @created: 01/11/2022
 * @project: spring-boot-jpa-docker
 * @package: pers.yewin.springbootjpadocker.controller
 */

@RestController
@Slf4j // for logging
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity addEmployee(@RequestBody Employee employee) {
        try {
            log.info("Request data: {}",employee);
            employeeService.saveEmployee(employee);
            log.info("Successfully save Employee: {}", employee);
        }catch(Exception e){
            e.printStackTrace();
            log.error("Error: {}",e.getMessage());
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findAllEmployee")
    public ResponseEntity findAllEmployee() {

        // declare response type to know program from outside of try/catch block.
        List<Employee> empList = new ArrayList<>();

        try {
            empList = employeeService.getAllEmployees();
            log.info("Response data: {}", empList);
        }catch(Exception e){
            e.printStackTrace();
            log.error("Error: {}",e.getMessage());
        }
        return ResponseEntity.ok(empList);
    }


    @GetMapping("/findByEmployeeId/{id}")
    public ResponseEntity addEmployee(@PathVariable Long id) {
        // declare response type to know program from outside of try/catch block.
        Employee employee = new Employee();
        try {
            log.info("Request data: {}", id);
            employee = employeeService.getById(id);
            log.info("Response Data: {}", employee);
        }catch(Exception e){
            e.printStackTrace();
            log.error("Error: {}",e.getMessage());
        }
        return ResponseEntity.ok(employee);
    }

    /**
     * I don't add any other APIs because this is demo project for spring boot jpa and running as container to connect to containerize db.
     */

}
