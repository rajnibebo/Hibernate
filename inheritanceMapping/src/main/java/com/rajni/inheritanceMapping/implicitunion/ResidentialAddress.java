/**
 * 
 */
package com.rajni.inheritanceMapping.implicitunion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "RESIDENTIAL_ADDRESS")
public class ResidentialAddress extends Address {
	@Column(name = "STREET_NUMBER")
	private String streetNo;
	private transient String addressType = "ResidentialType";
	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	@Override
	public String getAddressType() {
		// TODO Auto-generated method stub
		return addressType;
	}
	
}
