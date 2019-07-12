package com.sample.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.rest.dao.DepartmentDao;

@Controller
public class HrController {
	
	@Autowired
	private DepartmentDao departmentDao;
	
	@RequestMapping(value= {"/", "/home"})
	public String hr(Model model) {
		
		model.addAttribute("jobs", departmentDao.getAllJobs());
		model.addAttribute("managers", departmentDao.getAllManagers());
		model.addAttribute("departments", departmentDao.getAllDepartments());
		
		return "hr";
	}
	
}
