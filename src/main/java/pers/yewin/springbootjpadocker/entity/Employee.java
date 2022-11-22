package pers.yewin.springbootjpadocker.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author: Ye Win
 * @created: 01/11/2022
 * @project: spring-boot-jpa-docker
 * @package: pers.yewin.springbootjpadocker.entity
 */

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
