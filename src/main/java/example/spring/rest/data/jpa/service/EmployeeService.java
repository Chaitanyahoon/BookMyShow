package example.spring.rest.data.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.spring.rest.data.jpa.entity.Department;
import example.spring.rest.data.jpa.entity.Employee;
import example.spring.rest.data.jpa.repo.DepartmentRepository;
import example.spring.rest.data.jpa.repo.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	@Autowired
	private DepartmentRepository deptRepo;

	public void createEmployee(Employee emp) {
		empRepo.save(emp);
	}

	public void linkEmpToDept(Integer empNo, Integer deptNo) {
		Employee emp = empRepo.findById(empNo).orElse(null);
		Department dept = deptRepo.findById(deptNo).orElse(null);
		if (emp != null && dept != null) {
			dept.getEmployees().add(emp);
			deptRepo.save(dept);
		}
	}

	public void deleteEmployee(Integer empNo) {
		empRepo.deleteById(empNo);
	}
}
