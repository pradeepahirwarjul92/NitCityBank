package com.heg.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.EmbeddedId;

@Entity
@Table(name = "PROGRAMMER_PROJECT_INFO")
public class ProjectInfo implements Serializable {

	

	@EmbeddedId
	private ProjectId id;

	private String pname;
	private String deptNo;
	private String projName;

	public ProjectId getId() {
		return id;
	}

	public void setId(ProjectId id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public ProjectInfo(ProjectId id, String pname, String deptNo, String projName) {
		super();
		this.id = id;
		this.pname = pname;
		this.deptNo = deptNo;
		this.projName = projName;
	}

	public ProjectInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProjectInfo [id=" + id + ", pname=" + pname + ", deptNo=" + deptNo + ", projName=" + projName + "]";
	}

	
	
}
