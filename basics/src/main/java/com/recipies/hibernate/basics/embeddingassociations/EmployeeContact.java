/**
 * 
 */
package com.recipies.hibernate.basics.embeddingassociations;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author rajni.ubhi
 *
 */
@Embeddable
public class EmployeeContact {
	@Embedded
	private EmployeePhone phone;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "HOME_ADDRESS_ID")
	private EmployeeAddress address;

	public EmployeePhone getPhone() {
		return phone;
	}

	public void setPhone(EmployeePhone phone) {
		this.phone = phone;
	}

	public EmployeeAddress getAddress() {
		return address;
	}

	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}

}
