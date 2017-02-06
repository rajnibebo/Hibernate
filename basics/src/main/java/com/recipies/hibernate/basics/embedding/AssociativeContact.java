/**
 * 
 */
package com.recipies.hibernate.basics.embedding;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author rajni.ubhi
 *
 */
@Embeddable
public class AssociativeContact {
	@Column(name = "BILLING_RECIPIENT")
	private String recipient;
	@Embedded
	private AssociativeAddress address;
	@Column(name = "BILL_RECIEVED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date receivedTime;
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public AssociativeAddress getAddress() {
		return address;
	}
	public void setAddress(AssociativeAddress address) {
		this.address = address;
	}
	public Date getReceivedTime() {
		return receivedTime;
	}
	public void setReceivedTime(Date receivedTime) {
		this.receivedTime = receivedTime;
	}
	
}
