package kr.co.hta.vo;

import java.util.Date;

import lombok.Data;

@Data
public class Product {

	private Integer no;
	private String name;
	private String categoryId;
	private String imgName;
	private Integer price;
	private String summary;
	private String soldOut;
	private String type;
	private Date createDate;	
	
}
