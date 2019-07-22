package kr.co.hta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.hta.vo.Category;

@Repository
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	private SqlMapClientTemplate template;
	
	@Override
	public List<Category> getAllCategories() {
		return template.queryForList("category.getAllCategories");
	}
}
