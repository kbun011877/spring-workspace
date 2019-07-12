package kr.co.hta.service;

import java.util.List;

import kr.co.hta.vo.Product;

public interface ProductService {

	List<Product> getProductByTypeOfNew();
	List<Product> getProductByTypeOfRecommend();
}
