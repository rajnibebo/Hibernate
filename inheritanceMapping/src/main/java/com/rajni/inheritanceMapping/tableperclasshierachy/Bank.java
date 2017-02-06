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
@DiscriminatorValue("BA")
public class Bank extends Billing {
	@Column(name = "BANK_ACC_NUMBER")
	private String bankAccount;
	@Column(name = "BANK_NAME")
	private String bankName;
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
}
