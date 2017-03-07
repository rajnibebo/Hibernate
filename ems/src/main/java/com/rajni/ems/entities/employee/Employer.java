/**
 * 
 */
package com.rajni.ems.entities.employee;

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
@Table(name = "PREV_EMPLOYER_DETAILS")
public class Employer {
	@Id
	@GeneratedValue
	@Column(name = "EMPLOYER_ID")
	private Long employerId;
	@Column(name = "EMPLOYER_NAME")
	private String employerName;
	@Column(name = "YEARS_OF_EXPERIENCE")
	private int yearsOfExperience;
	@Column(name = "IS_VALIDATED" , insertable = false)
	private boolean isValidated;
	public Long getEmployerId() {
		return employerId;
	}
	public void setEmployerId(Long employerId) {
		this.employerId = employerId;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public boolean isValidated() {
		return isValidated;
	}
	public void setValidated(boolean isValidated) {
		this.isValidated = isValidated;
	}
	
}
