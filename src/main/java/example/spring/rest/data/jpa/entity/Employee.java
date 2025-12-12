package example.spring.rest.data.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Emp_Master")
public class Employee {
	@Id
	@Column(name = "emp_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empNo;
	@Column(name = "emp_name", length = 30)
	private String name;
	@Column(name = "emp_sal")
	private int salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empNo, String name, int salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", salary=" + salary + "]";
	}

}
