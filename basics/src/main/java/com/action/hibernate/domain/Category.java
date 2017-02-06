/**
 * 
 */
package com.action.hibernate.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "CATEGORY")
public class Category {
	@Id
	@GeneratedValue
	@Column(name = "CAT_ID")
	private Long categoryId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PARENT_CAT_ID")
	private Category parentCategory;
	private Set<Category> childCategories = new HashSet<Category>();
	private Set<Item> items = new HashSet<Item>();
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Category getParentCategory() {
		return parentCategory;
	}
	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}
	public Set<Category> getChildCategories() {
		return childCategories;
	}
	public Set<Item> getItems() {
		return items;
	}
	public void setItems(Set<Item> items) {
		this.items = items;
	}
	public void addChildCategory(Category childCategory) {
		if(childCategory == null) {
			throw new IllegalArgumentException("Null Category not accepted");
		}
		if(childCategory.getParentCategory() != null) {
			childCategory.getParentCategory().getChildCategories().remove(childCategory);
		}
		childCategory.setParentCategory(this);
		childCategories.add(childCategory);
	}
}
