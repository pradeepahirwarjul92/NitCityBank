package com.heg.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="PERSON_INFO1")
public class PersonInfo1 implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;
	
	@Column(length = 20)
	private String pname;
	
	@Column(length = 20)
	private String paddrs;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;
	
	@Temporal(TemporalType.DATE)
	private Date dom;
	
	@Temporal(TemporalType.DATE)
	private Date doj;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPaddrs() {
		return paddrs;
	}

	public void setPaddrs(String paddrs) {
		this.paddrs = paddrs;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDom() {
		return dom;
	}

	public void setDom(Date dom) {
		this.dom = dom;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "PersonInfo1 [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + ", dob=" + dob + ", dom=" + dom
				+ ", doj=" + doj + "]";
	}

	public PersonInfo1(Integer pid, String pname, String paddrs, Date dob, Date dom, Date doj) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.paddrs = paddrs;
		this.dob = dob;
		this.dom = dom;
		this.doj = doj;
	}

	public PersonInfo1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
