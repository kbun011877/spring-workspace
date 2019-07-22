package kr.co.hta.dao;

import java.util.List;
import java.util.Map;

import kr.co.hta.vo.Product;

public interface ProductDao {

	List<Product> getNewProducts();
	List<Product> getRecommendProducts();
	List<Product> getProductsByCategory(Map<String, String> param);
	Product getProductByNo(int no);
}
