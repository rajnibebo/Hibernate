/**
 * 
 */
package com.recipies.hibernate.basics;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author rajni.ubhi
 *
 */
@Embeddable
public class Address {
	@Column(name = "BILLING_STREET")
	private String street;
	@Column(name = "BILLING_CITY")
	private String city;
	@Column(name = "BILLING_STATE")
	private String state;
	@Column(name = "BILLING_COUNTRY")
	private String country;
	@Column(name = "BILLING_ZIPCODE")
	private String zipcode;
	
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
	
}
