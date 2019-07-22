package kr.co.hta.service;

import java.util.List;
import java.util.Map;

import kr.co.hta.vo.Cart;
import kr.co.hta.vo.Category;
import kr.co.hta.vo.Product;

public interface ProductService {

	Map<String, List<Product>> getHomeProductItems(); 
	List<Category> getAllCategories();
	List<Product> getProductsByCategory(String opt, String keyword);
	void addCart(int productNo, String userId);
	List<Cart> getCartsByUserId(String userId);
	void deleteCart(int cartNo);
}
