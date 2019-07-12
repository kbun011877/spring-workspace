package kr.co.hta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.hta.vo.Cart;

@Repository
public class CartDaoImpl implements CartDao{

	@Autowired
	private SqlMapClientTemplate template;
	
	@Override
	public List<Cart> getCartByUser(String userId) {
		return template.queryForList("Cart.getCartListBuUser", userId);
	}
	
	@Override
	public void deleteCart(Integer no) {
		template.delete("Cart.deleteCart", no);
	}
}
