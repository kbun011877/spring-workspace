package com.sample.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.rest.dao.DepartmentDao;
import com.sample.rest.dao.EmployeeDao;
import com.sample.rest.vo.Department;
import com.sample.rest.vo.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private DepartmentDao departmentDao;
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@GetMapping("/depts")
	public List<Department> departments() {
		return departmentDao.getAllDepartments();
	}
	
	@GetMapping("/emps/{deptId}")
	public List<Employee> employees(@PathVariable("deptId") int deptId) {
		return departmentDao.getEmpoyeeByDeptId(deptId);
	}
	
	@PostMapping("/emps")
	public List<Employee> addEmployee(@RequestBody Employee employee) {
		employeeDao.addEmployee(employee);
		return departmentDao.getEmpoyeeByDeptId(employee.getDepartmentId());
	}
	
	@DeleteMapping("/emps/{empId}")
	public List<Employee> deleteEmployee(@PathVariable("empId") int empId) {
		Employee employee = employeeDao.getEmployeeById(empId);
		employeeDao.removeEmployee(empId);
		
		return departmentDao.getEmpoyeeByDeptId(employee.getDepartmentId());
	}
	
	
	
}
