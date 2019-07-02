package kr.co.jhta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;

import kr.co.jhta.vo.Department;

public class DepartmentDao {

	@Autowired
	private SqlMapClientTemplate template;
	
	public List<Department> getAllDept() {
		return template.queryForList("getAllDept");
	}
	
	
}
