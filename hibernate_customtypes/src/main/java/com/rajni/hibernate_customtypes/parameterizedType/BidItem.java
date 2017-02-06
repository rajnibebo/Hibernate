/**
 * 
 */
package com.rajni.hibernate_customtypes.parameterizedType;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.rajni.hibernate_customtypes.userType.MonetaryAmount;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "BID_ITEM")
@TypeDefs({
		@TypeDef(name = "amount_conversion_inr", typeClass = MonetaryAmountConversionType.class, parameters = { @Parameter(name = "convertTo", value = "INR") }),
		@TypeDef(name = "amount_conversion_usd", typeClass = MonetaryAmountConversionType.class, parameters = { @Parameter(name = "convertTo", value = "USD") }) })
public class BidItem {
	@Id
	@GeneratedValue
	@Column(name = "BID_ITEM_ID")
	private Long itemId;
	@Column(name = "ITEM_NAME")
	private String itemName;
	@Type(type = "amount_conversion_inr")
	@Columns(columns = { @Column(name = "BID_AMOUNT"),@Column(name = "BID_CUR") })
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
