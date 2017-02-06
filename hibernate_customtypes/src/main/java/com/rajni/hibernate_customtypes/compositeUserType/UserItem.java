/**
 * 
 */
package com.rajni.hibernate_customtypes.compositeUserType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Type;

import com.rajni.hibernate_customtypes.userType.MonetaryAmount;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "USER_ITEM")
public class UserItem {
	@Id
	@GeneratedValue
	@Column(name = "ITEM_ID")
	private Long itemId;
	@Column(name = "ITEM_NAME")
	private String itemName;
	@Type(type="com.rajni.hibernate_customtypes.compositeUserType.MonetaryAmountCompositeUserType")
	@Columns(columns={ @Column(name = "INITIAL_PRICE"),@Column(name = "PRICE_CURRENCY")})
	private MonetaryAmount price;
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
	public MonetaryAmount getPrice() {
		return price;
	}
	public void setPrice(MonetaryAmount price) {
		this.price = price;
	}
	
}
