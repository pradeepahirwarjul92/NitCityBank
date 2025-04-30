package com.heg.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ProjectId implements Serializable {

	
	private Integer pid;
	private Integer projId;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getProjId() {
		return projId;
	}

	public void setProjId(Integer projId) {
		this.projId = projId;
	}

	@Override
	public String toString() {
		return "ProjectId [pid=" + pid + ", projId=" + projId + "]";
	}

	public ProjectId(Integer pid, Integer projId) {
		super();
		this.pid = pid;
		this.projId = projId;
	}

	public ProjectId() {
		super();
		// TODO Auto-generated constructor stub
	}

}
