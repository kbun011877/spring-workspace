package com.sample.rest.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sample.rest.vo.Department;
import com.sample.rest.vo.Employee;
import com.sample.rest.vo.Job;

@Repository
public class DepartmentDao {

	@Autowired
	private JdbcTemplate template;
	
	/**
	 * 	 
	 * @return
	 */
	public List<Job> getAllJobs() {
		String sql = "select * from jobs order by job_id asc";
		
		return template.query(sql, new RowMapper<Job>() {
			@Override
			public Job mapRow(ResultSet rs, int rowNum) throws SQLException {
				Job job = new Job();
				job.setId(rs.getString("job_id"));
				job.setTitle(rs.getString("job_title"));
				job.setMinSalary(rs.getInt("min_salary"));				
				job.setMaxSalary(rs.getInt("max_salary"));				
				
				return job;
			}
		});
	}
	
	/**
	 * 모든 매니저들을 조회
	 * @return 매니저 목록
	 */
	public List<Employee> getAllManagers() {
		String sql = "select * from employees where employee_id in (select distinct manager_id from employees)";
		
		return template.query(sql, new RowMapper<Employee>() {
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
		});
	}
	
	/**
	 * 모든 부서정보를 조회한다
	 * @return 부서목록
	 */
	public List<Department> getAllDepartments() {
		String sql = "select * from departments order by  department_id";
		
		return template.query(sql, new RowMapper<Department>() {
			@Override
			public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
				Department dept = new Department();
				dept.setId(rs.getInt("department_id"));
				dept.setName(rs.getString("department_name"));
				dept.setManagerId(rs.getInt("manager_id"));
				dept.setLocationId(rs.getInt("location_id"));
				
				return dept;
			}
		});
	}
	/**
	 * 지정된 부서아이디에 소속된 사원들을 조회한다.
	 * @param deptId
	 * @return 해당 부서에 소속된 사원 목록
	 */
	public List<Employee> getEmpoyeeByDeptId(int deptId) {
		String sql = "select * from employees where department_id = ?";
		
		return template.query(sql, new RowMapper<Employee>() {
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
		}, deptId);
	}
}
