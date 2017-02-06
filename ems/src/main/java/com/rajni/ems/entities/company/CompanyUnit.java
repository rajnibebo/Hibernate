/**
 * 
 */
package com.rajni.ems.entities.company;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.rajni.ems.entities.Address;
import com.rajni.ems.entities.employee.Employee;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "COMPANY_UNIT")
public class CompanyUnit {
	@Id
	@GeneratedValue
	@Column(name = "COMPANY_UNIT_ID")
	private Long companyUnitId;
	@Column(name = "COMPANY_UNIT_NAME")
	private String companyUnitName;
	@OneToOne(cascade = CascadeType.ALL)
	private Address companyUnitAddress;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ESTABLIHED_DATE")
	private Date establishedDate;
	@Basic
	private int numberOfEmployees;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Employee> employees = new HashSet<Employee>();
	
	public Long getCompanyUnitId() {
		return companyUnitId;
	}
	public void setCompanyUnitId(Long companyUnitId) {
		this.companyUnitId = companyUnitId;
	}
	public String getCompanyUnitName() {
		return companyUnitName;
	}
	public void setCompanyUnitName(String companyUnitName) {
		this.companyUnitName = companyUnitName;
	}
	public Address getCompanyUnitAddress() {
		return companyUnitAddress;
	}
	public void setCompanyUnitAddress(Address companyUnitAddress) {
		this.companyUnitAddress = companyUnitAddress;
	}
	public Date getEstablishedDate() {
		return establishedDate;
	}
	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	 
}
