package com.lnjb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="HB_STUDENT_INFO")
public class Student {

	@Id
	@TableGenerator(name="gen2" , 
					pkColumnName = "ID_COL", 
					valueColumnName = "ID_VAL" , 
					pkColumnValue = "PID" , 
					table = "HB_STUDENT_ID_TAB", 
					initialValue = 10 , 
					allocationSize = 5)
	@GeneratedValue(generator = "gen2",strategy = GenerationType.TABLE)
	private Long id;
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
