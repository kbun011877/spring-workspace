package kr.co.hta.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.hta.vo.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SqlMapClientTemplate template;
	
	@Override
	public List<Product> getNewProducts() {
		return template.queryForList("product.getNewProducts");
	}
	
	@Override
	public List<Product> getRecommendProducts() {
		return template.queryForList("product.getRecommendProducts");
	}
	
	@Override
	public List<Product> getProductsByCategory(Map<String, String> param) {
		return template.queryForList("product.getProductsByCategory", param);
	}
	
	@Override
	public Product getProductByNo(int no) {
		return (Product) template.queryForObject("product.getProductByNo", no);
	}
}
