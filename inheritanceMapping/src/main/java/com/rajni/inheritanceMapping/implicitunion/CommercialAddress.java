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
@Table(name = "COMMERCIAL_ADDRESS")
public class CommercialAddress extends Address {
	@Column(name = "LANDMARK")
	private String landmark;
	@Column(name = "AREA_CODE")
	private String areaCode;
	
	private transient String addressType = "CommercialAddress";
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	@Override
	public String getAddressType() {
		// TODO Auto-generated method stub
		return addressType;
	}
	
}
