/**
 * 
 */
package com.rajni.inheritanceMapping.mixin;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "BILLING_INFO")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "BILLING_TYPE")
public abstract class BillingInfo {
	@Id
	@GeneratedValue
	@Column(name = "BILLING_ID")
	private Long billingId;
	@Column(name = "BILL_OWNER")
	private String owner;
	public Long getBillingId() {
		return billingId;
	}
	public void setBillingId(Long billingId) {
		this.billingId = billingId;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
