package example.spring.rest.data.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import example.spring.rest.data.jpa.entity.Employee;

public interface EmployeeRepository 
extends JpaRepository<Employee, Integer>{

}
