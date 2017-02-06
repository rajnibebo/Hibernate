/**
 * 
 */
package com.rajni.ems.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author rajni.ubhi
 *
 */
@Embeddable
public class Phone {
	@Column(name = "LANDLINE_AREA_CODE")
	private String areaCode;
	@Column(name = "LANDLINE_PHONE_NUMBER")
	private String phoneNumber;
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
