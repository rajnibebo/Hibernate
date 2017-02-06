/**
 * 
 */
package com.hibernate.action.collectionmappings.set;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 * @author rajni.ubhi
 *
 */
@Table(name = "PRODUCT")
@Entity
public class Product {
	@Id
	@GeneratedValue
	@Column(name = "PROD_ID")
	private Long productId;
	@Column(name = "PROD_NAME")
	private String productName;
	@Column(name = "PROD_PRICE")
	private Double price;
	@ElementCollection//(fetch = FetchType.EAGER)
	@CollectionTable(name = "PRODUCT_IMAGES",joinColumns = @JoinColumn(name = "PRODUCT_ID"))
	private Set<Image> images = new HashSet<Image>();
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Set<Image> getImages() {
		return images;
	}
	public void setImages(Set<Image> images) {
		this.images = images;
	}
	public void addImage(Image image) {
		this.images.add(image);
	}
	
}
