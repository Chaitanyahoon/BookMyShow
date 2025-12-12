package example.spring.rest.data.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.spring.rest.data.jpa.entity.Department;
import example.spring.rest.data.jpa.repo.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository deptRepo;

	public void createDepartment(Department dept) {
		deptRepo.save(dept);
	}

	public List<Department> getAllDepartments() {
		return deptRepo.findAll();
	}

	public Department getOneDepartment(Integer deptNo) {
		Department dept = deptRepo.findById(deptNo).orElse(null);
		return dept;
	}

	public void deleteDepartment(Integer deptNo) {
		deptRepo.deleteById(deptNo);
	}
}
