package kr.co.hta.dao;

import java.util.List;

import kr.co.hta.vo.Cart;

public interface CartDao {

	List<Cart> getCartByUser(String userId);
	void deleteCart(Integer no);
}
