package com.lnjb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;



@Entity
@Table(name = "IDENTITY_ANN_GEN")
public class Employee{

	@Id
	//@GenericGenerator(name = "gen1", strategy = "increment")
	//@GenericGenerator(name = "gen1", strategy = "identity")
	//@GenericGenerator(name = "gen1", strategy = "sequence", parameters = @Parameter(name="sequence_name", value = "HBM_SEQ_TEST"))
	
	@SequenceGenerator(name="gen1", 
						sequenceName = "JPA_PID_SEQ", 
						initialValue = 1000, 
						allocationSize = 10)
	@GeneratedValue(generator = "gen1" ,strategy = GenerationType.SEQUENCE)
	@Column(name = "emp_code")
	private Long id;

	@Column(name = "emp_name", length = 80, nullable = false)
	private String empName;

	private Integer age;

	private Float salary;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

}
