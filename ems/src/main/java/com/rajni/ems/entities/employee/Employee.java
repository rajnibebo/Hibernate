/**
 * 
 */
package com.rajni.ems.entities.employee;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Formula;

import com.rajni.ems.entities.Designation;
import com.rajni.ems.entities.company.CompanyUnit;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name = "EMPLOYEE_ID")
	private Long employeeID;
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private PersonalDetails personalDetails;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private CompanyUnit companyUnit;	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_OF_JOINING")
	private Date dateOfJoining;
	@OneToOne
	@JoinColumn(name = "EMP_DESIGNATION_ID")
	private Designation designation;
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;
	@Formula("date_part('year',age(dateOfBirth))")
	private int age;
	
	public Long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Long empId) {
		this.employeeID = empId;
	}

	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}

	public CompanyUnit getCompanyUnit() {
		return companyUnit;
	}

	public void setCompanyUnit(CompanyUnit companyUnit) {
		this.companyUnit = companyUnit;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
