package kr.co.hta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.hta.dao.CartDao;
import kr.co.hta.vo.Cart;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartDao cartDao;
	
	@Override
	public List<Cart> getCart(String userId) {
		return cartDao.getCartByUser(userId);
	}
	
	@Override
	public void deleteCart(Integer no) {
		cartDao.deleteCart(no);
	}
	
}
