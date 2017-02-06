/**
 * 
 */
package com.recipies.hibernate.basics.embedding;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 * @author rajni.ubhi
 *
 */
@Embeddable
public class AssociativeAddress {
	@Column(name = "BILLING_STREET")
	private String street;
	@Column(name = "BILLING_CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "ZIPCODE")
	private String zipcode;
	@Embedded
	private AssociativePhone phone;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public AssociativePhone getPhone() {
		return phone;
	}
	public void setPhone(AssociativePhone phone) {
		this.phone = phone;
	}
	
}
