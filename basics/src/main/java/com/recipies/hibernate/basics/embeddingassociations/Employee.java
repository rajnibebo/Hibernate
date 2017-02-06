/**
 * 
 */
package com.recipies.hibernate.basics.embeddingassociations;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

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
	private Long empId;
	@Column(name = "EMP_NAME")
	private String name;
	@Column(name = "EMP_AGE")
	private int age;
	@Embedded
	private EmployeeContact homeContact;
	@Embedded
	@AssociationOverrides({ @AssociationOverride(joinColumns = @JoinColumn(name = "CURRENT_ADDRESS_ID"), name = "address") })
	@AttributeOverrides({
			@AttributeOverride(column = @Column(name = "CURRENT_AREA_CODE"), name = "phone.areaCode"),
			@AttributeOverride(column = @Column(name = "CURRENT_PHONE_NUMBER"), name = "phone.phoneNumber") })
	private EmployeeContact currentContact;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public EmployeeContact getHomeContact() {
		return homeContact;
	}

	public void setHomeContact(EmployeeContact homeContact) {
		this.homeContact = homeContact;
	}

	public EmployeeContact getCurrentContact() {
		return currentContact;
	}

	public void setCurrentContact(EmployeeContact currentContact) {
		this.currentContact = currentContact;
	}

}
