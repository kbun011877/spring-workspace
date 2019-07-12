package kr.co.hta.dao;

import java.util.List;

import kr.co.hta.vo.Product;

public interface ProductDao {

	List<Product> getProductByType(String sold);
}
