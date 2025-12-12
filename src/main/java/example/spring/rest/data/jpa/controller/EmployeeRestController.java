package example.spring.rest.data.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.spring.rest.data.jpa.entity.Employee;
import example.spring.rest.data.jpa.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeRestController {
	@Autowired
	private EmployeeService empServ;

	@PostMapping
	public void createEmployee(@RequestBody Employee emp) {
		empServ.createEmployee(emp);
	}

	@PutMapping("/{empNo}/{deptNo}")
	public void linkEmpToDept(
			@PathVariable Integer empNo,
			@PathVariable Integer deptNo) {
		empServ.linkEmpToDept(empNo, deptNo);
	}

	@DeleteMapping("/{empNo}")
	public void deleteEmployee(@PathVariable Integer empNo) {
		empServ.deleteEmployee(empNo);
	}
}
