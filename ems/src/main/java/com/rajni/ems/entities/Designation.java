/**
 * 
 */
package com.rajni.ems.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author rajni.ubhi
 * 
 */
@Entity
@Table(name = "DESIGNATION")
public class Designation {
	@Id
	@GeneratedValue
	@Column(name = "DESIGNATION_ID")
	private Long designationId;
	@Column(name = "DESIGNATION_NAME")
	private String designationName;
	@Column(name = "EXPERIENCE_REQ_YEARS")
	private int experienceRequired;
	@Column(name = "SALARY")
	private Double salaryOffered;
	
	public Long getDesignationId() {
		return designationId;
	}
	public void setDesignationId(Long designationId) {
		this.designationId = designationId;
	}
	public String getDesignationName() {
		return designationName;
	}
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	public int getExperienceRequired() {
		return experienceRequired;
	}
	public void setExperienceRequired(int experienceRequired) {
		this.experienceRequired = experienceRequired;
	}
	public Double getSalaryOffered() {
		return salaryOffered;
	}
	public void setSalaryOffered(Double salaryOffered) {
		this.salaryOffered = salaryOffered;
	}
	
}
