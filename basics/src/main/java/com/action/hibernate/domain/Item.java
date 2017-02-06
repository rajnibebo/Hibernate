/**
 * 
 */
package com.action.hibernate.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author rajni.ubhi
 *
 */
public class Item {
	private Long itemId;
	private String description;
	private BigDecimal initialPrice;
	private BigDecimal reservePrice;
	private Date startDate;
	private Date endDate;
	private Date approvalDateTime;
	private Set<Category> categories = new HashSet<Category>();

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getInitialPrice() {
		return initialPrice;
	}

	public void setInitialPrice(BigDecimal initialPrice) {
		this.initialPrice = initialPrice;
	}

	public BigDecimal getReservePrice() {
		return reservePrice;
	}

	public void setReservePrice(BigDecimal reservePrice) {
		this.reservePrice = reservePrice;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getApprovalDateTime() {
		return approvalDateTime;
	}

	public void setApprovalDateTime(Date approvalDateTime) {
		this.approvalDateTime = approvalDateTime;
	}

	public Set<Category> getCategories() {
		return categories;
	}

//	private void setCategories(Set<Category> categories) {
//		this.categories = categories;
//	}
	public void addCategory(Category category) {
		if(category == null) {
			throw new IllegalArgumentException("Null Category not accepted");
		}
		category.getItems().add(this);
		categories.add(category);
	}
	

}
