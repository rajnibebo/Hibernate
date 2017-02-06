/**
 * 
 */
package com.hibernate.action.collectionmappings.idbag;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.Type;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "PRODUCT_BAG")
public class ProductBag {
	@Id
	@GeneratedValue
	@Column(name = "PRODUCT_ID")
	private Long productId;
	@Column(name = "PRODUCT_NAME")
	private String productName;
	@ElementCollection
	@CollectionTable(name = "IMAGE_BAG",joinColumns=@JoinColumn(name = "PRODUCT_ID"))
	@CollectionId(columns=@Column(name = "IMAGE_IDX_ID"), generator = "sequence", type = @Type(type = "java.lang.Long"))
	private Collection<ImageBag> images = new ArrayList<ImageBag>();
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
	public Collection<ImageBag> getImages() {
		return images;
	}
	public void setImages(Collection<ImageBag> images) {
		this.images = images;
	}
	
}
