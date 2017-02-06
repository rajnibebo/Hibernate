/**
 * 
 */
package com.recipies.hibernate.basics;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 * @author rajni.ubhi
 *
 */
@Embeddable
public class Contact {
	@Column(name = "BILLING_RECIPIENT")
	private String recipient;
	@Embedded
	private Address address;
	@Embedded
	private Phone phone;
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
}
