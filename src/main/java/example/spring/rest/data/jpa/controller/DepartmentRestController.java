package example.spring.rest.data.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.spring.rest.data.jpa.entity.Department;
import example.spring.rest.data.jpa.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentRestController {
	@Autowired
	private DepartmentService deptServ;

	@PostMapping
	public void createDepartment(@RequestBody Department dept) {
		deptServ.createDepartment(dept);
	}

	@GetMapping
	public List<Department> getAllDepartments() {
		return deptServ.getAllDepartments();
	}

	@GetMapping("/{deptNo}")
	public ResponseEntity<Department> getOneDepartment(@PathVariable Integer deptNo) {
		ResponseEntity<Department> response = ResponseEntity.notFound().build();
		Department foundDepartment = deptServ.getOneDepartment(deptNo);
		if (foundDepartment != null)
			response = ResponseEntity.ok(foundDepartment);
		return response;
	}

	@DeleteMapping("/{deptNo}")
	public void deleteDepartment(@PathVariable Integer deptNo) {
		deptServ.deleteDepartment(deptNo);
	}

}
