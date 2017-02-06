/**
 * 
 */
package com.recipies.hibernate.basics.pattern;

import com.recipies.hibernate.basics.Address;

/**
 * @author rajni.ubhi
 *
 */
public class AddressBuilder {
	private final Address address;
	
	public AddressBuilder() {
		// TODO Auto-generated constructor stub
		this.address = new Address();
	}
	public AddressBuilder city(String city) {
		this.address.setCity(city);
		return this;
	}
	public AddressBuilder state(String state) {
		this.address.setState(state);
		return this;
	}
	public AddressBuilder street(String street) {
		this.address.setStreet(street);
		return this;
	}
	public AddressBuilder country(String country) {
		this.address.setCountry(country);
		return this;
	}
	public AddressBuilder zipcode(String zipcode) {
		this.address.setZipcode(zipcode);
		return this;
	}
	public Address buildAddress() {
		return this.address;
	}
}
