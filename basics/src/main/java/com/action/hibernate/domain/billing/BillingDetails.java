/**
 * 
 */
package com.action.hibernate.domain.billing;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author rajni.ubhi
 *
 */
@MappedSuperclass
public abstract class BillingDetails {
	@Column(name = "OWNER")
	private String owner;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
