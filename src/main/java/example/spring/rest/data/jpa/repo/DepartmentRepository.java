package example.spring.rest.data.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import example.spring.rest.data.jpa.entity.Department;

public interface DepartmentRepository 
extends JpaRepository<Department, Integer>{

}
