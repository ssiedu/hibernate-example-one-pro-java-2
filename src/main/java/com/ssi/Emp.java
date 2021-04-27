package com.ssi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Emp {
	@Id
	@Column(name="ecode")
	private int eno;
	@Column(name="empname")
	private String ename;
	@Column(name="salary")
	private int sal;
	@Column(name="designation")
	private String desg;
	
	
	public Emp() {
		super();
	}
	public Emp(int eno, String ename, int sal, String desg) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.desg = desg;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", desg=" + desg + "]";
	}
	
	
}
