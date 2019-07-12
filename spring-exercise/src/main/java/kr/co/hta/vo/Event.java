package kr.co.hta.vo;

import java.util.Date;

import lombok.Data;

@Data
public class Event {

	private Integer no;
	private String title;
	private String contents;
	private String active;
	private Date createDate;

	
	
}
