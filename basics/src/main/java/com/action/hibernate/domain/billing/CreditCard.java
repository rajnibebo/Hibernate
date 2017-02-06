/**
 * 
 */
package com.action.hibernate.domain.billing;

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
@Table(name = "CREDIT_CARD")
@AttributeOverride(name = "owner",column=@Column(name = "CC_OWNER"))
public class CreditCard extends BillingDetails {
	@Id
	@GeneratedValue
	@Column(name = "CREDIT_CARD_ID")
	private Long crditCardId;
	@Column(name = "CREDIT_CARD_NUMBER")
	private String cardNumber;
	@Column(name = "EXP_MONTH")
	private int expiryMonth;
	@Column(name = "EXP_YEAR")
	private int expiryYear;
	
	public Long getCrditCardId() {
		return crditCardId;
	}
	public void setCrditCardId(Long crditCardId) {
		this.crditCardId = crditCardId;
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
