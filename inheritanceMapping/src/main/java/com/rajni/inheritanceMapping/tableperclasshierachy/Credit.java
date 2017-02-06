/**
 * 
 */
package com.rajni.inheritanceMapping.tableperclasshierachy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@DiscriminatorValue("CC")
public class Credit extends Billing {
	@Column(name = "CC_NUMBER")
	private String creditCardNumber;
	@Column(name = "CC_EXP_MONTH")
	private int expiryMonth;
	@Column(name = "CC_EXP_YEAR")
	private int expiryYear;
	
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public int getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	
}
