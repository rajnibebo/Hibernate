/**
 * 
 */
package com.hibernate.action.collectionmappings.mapwithembedded;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "PRODUCT_MAP")
public class ProductMap {
	
	@Id
	@GeneratedValue
	@Column(name = "PRODUCT_ID")
	private Long productId;
	
	@Column(name = "PRODUCT_NAME")
	private String productName;
	
	@ElementCollection
	@CollectionTable(name = "PRODUCT_IMAGE_MAP",joinColumns = @JoinColumn(name = "PROD_ID"))
	//@MapKeyClass(value = String.class)  // not required
	@MapKeyColumn(name = "IMAGE_SIZE")
	private Map<String, ImageMap> images = new HashMap<String, ImageMap>();
	
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
	public Map<String, ImageMap> getImages() {
		return images;
	}
	public void setImages(Map<String, ImageMap> images) {
		this.images = images;
	}
	
}
