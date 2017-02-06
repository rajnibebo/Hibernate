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
public class Phone {
	@Column(name = "BILLING_AREA_CODE")
	private String areaCode;
	@Column(name = "BILLING_PHONE_NUMBER")
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
