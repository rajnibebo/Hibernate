/**
 * 
 */
package com.rajni.inheritanceMapping.implicitpolymorphism;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "BANK_USER")
public class User {
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Long userId;
	@Column(name = "USER_NAME")
	private String userName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "BANK_ACC_ID")
	private CreditCard details;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public CreditCard getDetails() {
		return details;
	}
	public void setDetails(CreditCard details) {
		this.details = details;
	}
	
}
