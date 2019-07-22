package kr.co.hta.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.hta.dao.CartDao;
import kr.co.hta.dao.CategoryDao;
import kr.co.hta.dao.ProductDao;
import kr.co.hta.dao.UserDao;
import kr.co.hta.vo.Cart;
import kr.co.hta.vo.Category;
import kr.co.hta.vo.Product;
import kr.co.hta.vo.User;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private CartDao cartDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public Map<String, List<Product>> getHomeProductItems() {
		Map<String, List<Product>> products = new HashMap<String, List<Product>>();
		products.put("newProducts", productDao.getNewProducts());
		products.put("recommendProducts", productDao.getRecommendProducts());
		return products;
	}
	
	@Override
	public List<Category> getAllCategories() {
		return categoryDao.getAllCategories();
	}
	
	@Override
	public List<Product> getProductsByCategory(String opt, String keyword) {
		Map<String, String> param = new HashMap<String, String>();
		param.put("opt", opt);
		param.put("keyword", keyword);
		
		return productDao.getProductsByCategory(param);
	}
	
	@Override
	public void addCart(int productNo, String userId) {
		Cart cart = new Cart();
		
		Product product = productDao.getProductByNo(productNo);
		User user = userDao.getUserById(userId);
		cart.setProduct(product);
		cart.setUser(user);
		
		cartDao.addCart(cart);
	}
	
	@Override
	public List<Cart> getCartsByUserId(String userId) {
		return cartDao.getCartsByUserId(userId);
	}
	
	@Override
	public void deleteCart(int cartNo) {
		cartDao.deleteCart(cartNo);
	}
}
