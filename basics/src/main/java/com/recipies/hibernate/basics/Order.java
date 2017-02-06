/**
 * 
 */
package com.recipies.hibernate.basics;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "CUSTOMER_ORDER")
public class Order {
	@Id
	@GeneratedValue
	@Column(name = "ORDER_ID")
	private Long orderId;
	@Embedded
	private Contact billingContact;
	@Embedded
	@AttributeOverrides({
			@AttributeOverride(column = @Column(name = "SHIPPING_RECIPIENT"), name = "recipient"),
			@AttributeOverride(column = @Column(name = "SHIPPING_STREET"), name = "address.street"),
			@AttributeOverride(column = @Column(name = "SHIPPING_CITY"), name = "address.city"),
			@AttributeOverride(column = @Column(name = "SHIPPING_STATE"), name = "address.state"),
			@AttributeOverride(column = @Column(name = "SHIPPING_ZIPCODE"), name = "address.zipcode"),
			@AttributeOverride(column = @Column(name = "SHIPPING_COUNTRY"), name = "address.country"),
			@AttributeOverride(column = @Column(name = "SHIPPING_AREACODE"), name = "phone.areaCode"),
			@AttributeOverride(column = @Column(name = "SHIPPING_PHONE_NUMBER"), name = "phone.phoneNumber")})
	private Contact shippingContact;
	@Column(name = "ORDER_TOTAL")
	private Double orderTotal;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Contact getBillingContact() {
		return billingContact;
	}

	public void setBillingContact(Contact billingContact) {
		this.billingContact = billingContact;
	}

	public Contact getShippingContact() {
		return shippingContact;
	}

	public void setShippingContact(Contact shippingContact) {
		this.shippingContact = shippingContact;
	}

	public Double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}

}
