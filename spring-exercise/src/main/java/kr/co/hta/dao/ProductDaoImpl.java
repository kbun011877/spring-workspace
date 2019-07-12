package kr.co.hta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.hta.vo.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private SqlMapClientTemplate template;
	
	@Override
	public List<Product> getProductByType(String type) {
		return template.queryForList("Product.getProductBySold", type);
	}
	
	
}
