package kr.co.jhta.vo;

import java.util.Date;

public class Employee {

	private int id;
	private String fn;
	private String ln;
	private String email;
	private String phoneNumber;
	private Date hireDate;
	private String jId;
	private int salary;
	private int commissionCnt;
	private int mId;
	private int deptId;
	
	public Employee() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getbId() {
		return jId;
	}

	public void setJId(String jId) {
		this.jId = jId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommissionCnt() {
		return commissionCnt;
	}

	public void setCommissionCnt(int commissionCnt) {
		this.commissionCnt = commissionCnt;
	}

	public int getMId() {
		return mId;
	}

	public void setMId(int mId) {
		this.mId = mId;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	
	
}
