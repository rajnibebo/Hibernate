/**
 * 
 */
package com.rajni.ems.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "ADDRESS")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "ADDRESS_ID")
	private Long addressId;
	@Column(name = "STREET_NUMBER")
	private String streetNo;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "ZIPCODE")
	private String zipcode;
	@Embedded
	private Phone landlineNumber;
	@Embedded
	@AttributeOverrides({@AttributeOverride(column=@Column(name="MOB_AREA_CODE"),name="areaCode"),
		@AttributeOverride(column=@Column(name="MOB_PHONE_NUMBER"),name="phoneNumber")})
	private Phone mobileNumber;
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
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
	public Phone getLandlineNumber() {
		return landlineNumber;
	}
	public void setLandlineNumber(Phone landlineNumber) {
		this.landlineNumber = landlineNumber;
	}
	public Phone getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Phone mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
