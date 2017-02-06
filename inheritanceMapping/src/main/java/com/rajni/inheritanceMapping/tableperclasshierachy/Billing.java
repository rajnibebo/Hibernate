/**
 * 
 */
package com.rajni.inheritanceMapping.tableperclasshierachy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
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
@Table(name = "BILLING_DETAILS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "BILLING_TYPE", discriminatorType = DiscriminatorType.STRING)
public abstract class Billing {
	@Id
	@GeneratedValue
	@Column(name = "BILLING_DETAIL_ID")
	private Long billingDetailId;
	@Column(name = "OWNER")
	private String owner;

	public Long getBillingDetailId() {
		return billingDetailId;
	}

	public void setBillingDetailId(Long billingDetailId) {
		this.billingDetailId = billingDetailId;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
