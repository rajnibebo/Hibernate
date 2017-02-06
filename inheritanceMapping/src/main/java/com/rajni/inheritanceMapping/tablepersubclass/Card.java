/**
 * 
 */
package com.rajni.inheritanceMapping.tablepersubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "BILL_CARD")
@PrimaryKeyJoinColumn(name="BILL_CARD_ID")
public class Card extends Bill {
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
