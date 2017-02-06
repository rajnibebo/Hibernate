/**
 * 
 */
package com.rajni.inheritanceMapping.implicitpolymorphism;

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
@Table(name = "BANK_ACCOUNT_DETAILS")
public class BankAccount extends BillingDetails {
	@Id
	@GeneratedValue
	@Column(name = "BANK_ACCOUNT_ID")
	private Long bankAccountId;
	@Column(name = "BANK_ACC_NAME")
	private String accountName;
	@Column(name = "BANK_NAME")
	private String bankName;
	public Long getBankAccountId() {
		return bankAccountId;
	}
	public void setBankAccountId(Long bankAccountId) {
		this.bankAccountId = bankAccountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
}
