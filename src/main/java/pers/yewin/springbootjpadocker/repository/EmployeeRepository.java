package pers.yewin.springbootjpadocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pers.yewin.springbootjpadocker.entity.Employee;

/**
 * @author: Ye Win
 * @created: 01/11/2022
 * @project: spring-boot-jpa-docker
 * @package: pers.yewin.springbootjpadocker.repository
 */

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long> {
}
