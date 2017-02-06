/**
 * 
 */
package com.rajni.inheritanceMapping.mixin;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@DiscriminatorValue(value = "BANK")
public class BankAccountInfo extends BillingInfo {
	@Column(name = "BANK_ACC_NUMBER")
	private String bankAccountNumber;
	@Column(name = "BANK_NAME")
	private String bankName;
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
}
