/**
 * 
 */
package com.hibernate.action.collectionmappings.list;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.ListIndexBase;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "PRODUCT_LIST")
public class ProductList {
	@Id
	@GeneratedValue
	@Column(name = "PRODUCT_ID")
	private Long productId;
	@Column(name = "PRODUCT_NAME")
	private String productName;
	@ElementCollection
	@CollectionTable(name = "PRODUCT_IMAGES_LIST", joinColumns = @JoinColumn(name = "PROD_ID"))
	@OrderColumn(name = "IMG_IDX",nullable=true)
	@ListIndexBase(value = 1)
	private List<ImageList> images = new ArrayList<ImageList>();

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<ImageList> getImages() {
		return images;
	}

	public void setImages(List<ImageList> images) {
		this.images = images;
	}

}
