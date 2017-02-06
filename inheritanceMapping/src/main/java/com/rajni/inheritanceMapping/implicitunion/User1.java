/**
 * 
 */
package com.rajni.inheritanceMapping.implicitunion;

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
// (name="User_1")
@Table(name = "USER_1")
public class User1 {
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Long userId;
	@Column(name = "USER_NAME")
	private String userName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "USER_ADDRESS_ID", nullable = false)
	private Address userAddress;
	@Column(name = "USER_ADDRESS_TYPE")
	private String userAddressType; // = userAddress.getAddressType();

	public User1() {
		// TODO Auto-generated constructor stub
	}

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

	public Address getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
		setUserAddressType(userAddress.getAddressType());
	}

	public String getUserAddressType() {
		return userAddressType;
	}

	public void setUserAddressType(String userAddressType) {
		this.userAddressType = userAddressType;
	}

}
