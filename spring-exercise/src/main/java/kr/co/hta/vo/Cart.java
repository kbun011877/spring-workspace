package kr.co.hta.vo;

import java.util.Date;

import lombok.Data;

@Data
public class Cart {

	private Integer no;
	private String userId;
	private Date createDate;
	private Product product;
}
