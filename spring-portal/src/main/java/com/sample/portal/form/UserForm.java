package com.sample.portal.form;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.springframework.web.multipart.MultipartFile;

public class UserForm {

	@NotBlank(message="¾ÆÀÌµğ´Â ÇÊ¼ö ÀÔ·Â°ªÀÔ´Ï´Ù.")
	@Pattern(regexp="^[a-zA-Z0-9]{6,}$", message="¾ÆÀÌµğ´Â 6±ÛÀÚÀÌ»ó ¿µ¾î´ë¼Ò¹®ÀÚ/¼ıÀÚ¸¸ ÀÔ·ÂÇÏ¼¼¿ä.")
	private String id;
	
	@NotBlank(message="ÀÌ¸§´Â ÇÊ¼ö ÀÔ·Â°ªÀÔ´Ï´Ù.")
	@Pattern(regexp="^[°¡-ÆR]{2,}$", message="ÀÌ¸§Àº 2±ÛÀÚ ÀÌ»ó, ÇÑ±Û·Î ÀÔ·ÂÇØÁÖ¼¼¿ä.")
	private String name;
	
	@NotBlank(message="ºñ¹Ğ¹øÈ£´Â ÇÊ¼ö ÀÔ·Â°ªÀÔ´Ï´Ù.")
	@Pattern(regexp="^[a-zA-Z0-9]{8,}$",message="ºñ¹Ğ¹øÈ£´Â 8±ÛÀÚÀÌ»ó ¿µ¾î´ë¼Ò¹®ÀÚ/¼ıÀÚ¸¸ ÀÔ·ÂÇØÁÖ¼¼¿ä.")
	private String password;
	
	@NotBlank(message="ÀÌ¸ŞÀÏ´Â ÇÊ¼ö ÀÔ·Â°ªÀÔ´Ï´Ù.")
	@Email(message="À¯È¿ÇÑ ÀÌ¸ŞÀÏÇü½ÄÀÌ ¾Æ´Õ´Ï´Ù.")
	private String email;
	
	@NotBlank(message="ÀüÈ­¹øÈ£´Â ÇÊ¼ö ÀÔ·Â°ªÀÔ´Ï´Ù.")
	@Pattern(regexp="^\\d{2,3}-\\d{3,4}-\\d{4}$", message="ÀüÈ­¹øÈ£¸¦ ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä")
	private String phone;
	
	@NotNull(message="³ªÀÌ´Â ÇÊ¼ö ÀÔ·Â°ªÀÔ´Ï´Ù.")
	@Min(value=19, message="°¡ÀÔ°¡´É ¿¬·ÉÀº 19¼¼ ÀÌ»ó¸¸ °¡´ÉÇÕ´Ï´Ù.")
	private int age;
	
	@NotNull(message="»ıÀÏ´Â ÇÊ¼ö ÀÔ·Â°ªÀÔ´Ï´Ù.")
	@Past(message="»ıÀÏÀº ÇöÀç³¯Â¥ ÀÌÀü °ªÀ¸·Î ÀÔ·ÂÇÏ¼¼¿ä")
	private Date birth;
	private MultipartFile photofile;
	
	public UserForm() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public MultipartFile getPhotofile() {
		return photofile;
	}

	public void setPhotofile(MultipartFile photofile) {
		this.photofile = photofile;
	}
	
	
	
}
