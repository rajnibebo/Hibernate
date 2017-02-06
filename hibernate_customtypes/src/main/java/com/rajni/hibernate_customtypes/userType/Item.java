/**
 * 
 */
package com.rajni.hibernate_customtypes.userType;

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
@Table(name = "ITEM" , catalog="hib5.2", schema = "customTypes")
public class Item {
	@Id
	@GeneratedValue
	@Column(name = "ITEM_ID")
	private Long itemId;
	@Column(name = "ITEM_NAME")
	private String itemName;
	@Type(type="com.rajni.hibernate_customtypes.userType.MonetaryAmountUserType")
	@Column(name = "ITEM_PRICE")
	private MonetaryAmount initialPrice;
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
	public MonetaryAmount getInitialPrice() {
		return initialPrice;
	}
	public void setInitialPrice(MonetaryAmount initialPrice) {
		this.initialPrice = initialPrice;
	}
	
}
