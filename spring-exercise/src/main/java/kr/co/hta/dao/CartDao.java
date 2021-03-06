package kr.co.hta.dao;

import java.util.List;

import kr.co.hta.vo.Cart;

public interface CartDao {

	List<Cart> getCartsByUserId(String userId);
	void addCart(Cart cart);
	void deleteCart(int cartNo);
}
