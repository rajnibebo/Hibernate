/**
 * 
 */
package com.rajni.ems.entities.employee;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Formula;
import org.rajni.ems.employee.IPersonalDetails;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "EMP_PERSONAL_DETAILS")
public class PersonalDetails implements IPersonalDetails {
	@Id
	@Column(name = "EMP_ID")
	private Long employeeID;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "AGE")
	@Formula(value="date_part('year',age(DATE_OF_BIRTH))")
	private int age;
	@Column(name = "DATE_OF_BIRTH")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfBirth;
	@Column(name = "GENDER")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Column(name = "MARITAL_STATUS")
	@Enumerated(EnumType.STRING)
	private MaritalStatus maritalStatus;
	@Column(name = "MOTHER_NAME")
	private String motherName;
	@Column(name = "FATHER_NAME")
	private String fatherName;
	@Column(name = "SPOUSE_NAME")
	private String spouseName;
	
	public Long getEmployeeID() {
		return employeeID;
	}
	public void setEmpId(Long employeeID) {
		this.employeeID = employeeID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	
}
