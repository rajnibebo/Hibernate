/**
 * 
 */
package com.recipies.hibernate.basics.embeddingassociations;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author rajni.ubhi
 *
 */
@Embeddable
public class EmployeePhone {
	@Column(name = "HOME_AREA_CODE")
	private String areaCode;
	@Column(name = "HOME_PHONE_NUMBER")
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
