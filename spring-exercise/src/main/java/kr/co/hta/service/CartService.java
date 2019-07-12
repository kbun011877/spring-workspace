package kr.co.hta.service;

import java.util.List;

import kr.co.hta.vo.Cart;

public interface CartService {

	List<Cart> getCart(String userId);
	void deleteCart(Integer no);
}
