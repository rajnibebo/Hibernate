/**
 * 
 */
package com.rajni.inheritanceMapping.implicitpolymorphism;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "CREDIT_CARD_DETAILS")
@AttributeOverride(name = "owner", column = @Column(name = "CC_OWNER", nullable = false))
public class CreditCard extends BillingDetails {
	@Id
	@GeneratedValue
	@Column(name = "CREDIT_CARD_ID")
	private Long creditCardId;
	@Column(name = "CARD_NUMBER")
	private String cardNumber;
	@Column(name = "EXP_MONTH")
	private int expiryMonth;
	@Column(name = "EXP_YEAR")
	private int expiryYear;
	
	public Long getCreditCardId() {
		return creditCardId;
	}
	public void setCreditCardId(Long creditCardId) {
		this.creditCardId = creditCardId;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
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
