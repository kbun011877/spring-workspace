package kr.co.hta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.hta.vo.Cart;

@Repository
public class CartDaoImpl implements CartDao {

	@Autowired
	private SqlMapClientTemplate template;
	
	@Override
	public void addCart(Cart cart) {
		template.insert("cart.addCart", cart);
	}
	
	@Override
	public List<Cart> getCartsByUserId(String userId) {
		return template.queryForList("cart.getCartsByUserId", userId);
	}
	
	@Override
	public void deleteCart(int cartNo) {
		template.delete("cart.deleteCart", cartNo);
	}
}
