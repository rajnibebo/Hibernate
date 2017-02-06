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
@Table(name = "BILL_ACCOUNT")
@PrimaryKeyJoinColumn(name = "BILL_ACC_ID")
public class Account extends Bill {
	@Column(name = "ACC_NAME")
	private String accountName;
	@Column(name = "BANK_NAME")
	private String bankName;
	
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
