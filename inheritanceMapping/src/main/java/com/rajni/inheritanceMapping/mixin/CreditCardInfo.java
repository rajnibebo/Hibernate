/**
 * 
 */
package com.rajni.inheritanceMapping.mixin;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@DiscriminatorValue(value = "CC")
@SecondaryTable(name = "CREDIT_CARD_INFO", pkJoinColumns = @PrimaryKeyJoinColumn(name = "CREDIT_CARD_ID"))
public class CreditCardInfo extends BillingInfo {
	@Column(table = "CREDIT_CARD_INFO", name = "CC_NUMBER")
	private String cardNumber;
	@Column(table = "CREDIT_CARD_INFO", name = "CC_EXP_MONTH")
	private int expiryMonth;
	@Column(table = "CREDIT_CARD_INFO", name = "CC_EXP_YEAR")
	private int expiryYear;

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
