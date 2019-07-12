package com.sample.rest.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sample.rest.vo.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	private JdbcTemplate template;
	
	public void removeEmployee(int employeeId) {
		String sql = "delete from employees where employee_id = ?";
		template.update(sql, employeeId);
		
	}
	
	public List<Employee> getAllEmployees() {
		String sql = "select * from employees order by employee_id asc ";
		
		return template.query(sql, new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp = new Employee();
				emp.setId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_nunber"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));
								
				return emp;
			}
		});
	}
	
	public void addEmployee(Employee employee) {
		String sql = "insert into employees values(employees_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		template.update(sql,
							employee.getFirstName(),
							employee.getLastName(),
							employee.getEmail(),
							employee.getPhoneNumber(),
							employee.getHireDate(),
							employee.getJobId(),
							employee.getSalary(),
							employee.getCommissionPct(),
							employee.getManagerId(),
							employee.getDepartmentId());		
	}
	
	public Employee getEmployeeById(int empId) {
		String sql = "select * from employees where employee_id = ?";
		
		return template.queryForObject(sql, new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp = new Employee();
				emp.setId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));
								
				return emp;
			}
		}, empId);
	}
	
	
}
