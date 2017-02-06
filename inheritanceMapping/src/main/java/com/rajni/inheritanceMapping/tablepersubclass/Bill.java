/**
 * 
 */
package com.rajni.inheritanceMapping.tablepersubclass;

import javax.persistence.Column;
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
@Table(name = "BILL")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Bill {
	@Id
	@GeneratedValue
	@Column(name = "BILL_ID")
	private Long billId;
	@Column(name = "BILL_OWNER")
	private String owner;
	public Long getBillId() {
		return billId;
	}
	public void setBillId(Long billId) {
		this.billId = billId;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
