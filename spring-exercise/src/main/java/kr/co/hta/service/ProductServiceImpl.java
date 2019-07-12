package kr.co.hta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.hta.dao.ProductDao;
import kr.co.hta.vo.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Product> getProductByTypeOfNew() {
		return productDao.getProductByType("NEW");
	}
	
	@Override
	public List<Product> getProductByTypeOfRecommend() {
		return productDao.getProductByType("RECOMMEND");
	}
	
}
