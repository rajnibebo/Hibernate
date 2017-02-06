/**
 * 
 */
package com.action.hibernate.customtypes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "BUYER_ITEM")
public class BuyerItem {
	@Id
	@GeneratedValue
	@Column(name = "ITEM_ID")
	private Long itemId;
	@Column(name = "ITEM_NAME")
	private String itemName;
	@Type(type = "com.action.hibernate.customtypes.MonetaryAmountUserType")
	@Column(name = "ITEM_PRICE")
	private MonetaryAmount initialAmount;

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public MonetaryAmount getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(MonetaryAmount initialAmount) {
		this.initialAmount = initialAmount;
	}

}
