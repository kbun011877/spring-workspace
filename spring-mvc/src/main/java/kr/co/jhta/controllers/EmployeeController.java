package kr.co.jhta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.jhta.dao.DepartmentDao;
import kr.co.jhta.dao.EmployeeDao;
import kr.co.jhta.vo.Department;
import kr.co.jhta.vo.Employee;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeDao empDao;
	private DepartmentDao deptDao;
	
	@RequestMapping("/employees.do")
	public String employees(int deptId, Model model) {
		List<Employee> employee = empDao.getEmpBydept(deptId);
		model.addAttribute("dept", employee);
		
		return "emp/employees";
	}
	
	@RequestMapping("/employee.do")
	public String employee(int id, Model model) {
		Employee employee = empDao.getEmpById(id);
		model.addAttribute("emp", employee);
		
		return "emp/employee";
	}
	
	@RequestMapping("/form.do")
	public String form() {
		return "emp/form";
	}
	
	@RequestMapping("/depts.do")
	public String depts(Model model) {
		List<Department> depts = deptDao.getAllDept();
		model.addAttribute("depts", depts);
		
		return "emp/depts";
	}
	
}
