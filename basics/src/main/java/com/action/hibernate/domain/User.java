/**
 * 
 */
package com.action.hibernate.domain;

import java.util.StringTokenizer;

/**
 * @author rajni.ubhi
 *
 */
public class User {
	private Long userId;
	private Address address;
	private String firstName;
	private String lastName;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getUserName() {
		return firstName +" "+lastName;
	}
	public void setUserName(String userName) {
		StringTokenizer str = new StringTokenizer(userName);
		this.firstName = str.nextToken();
		this.lastName = str.nextToken();
	}
	
}
