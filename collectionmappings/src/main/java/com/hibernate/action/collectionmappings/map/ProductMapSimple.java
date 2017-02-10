/**
 * 
 */
package com.hibernate.action.collectionmappings.map;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "PRODUCT_MAP_SIMPLE")
public class ProductMapSimple {
	@Id
	@GeneratedValue
	@Column(name = "PRODUCT_ID")
	private Long productId;
	@Column(name = "PRODUCT_NAME")
	private String productName;
	
	@ElementCollection
	@CollectionTable(name = "PRODUCT_IMAGES_SIMPLE")
	@MapKeyColumn(name = "IMAGE_NAME")
	@Column(name = "IMAGE_LOCATION")
	private Map<String, String> imagesMap = new HashMap<String, String>();
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
	public Map<String, String> getImagesMap() {
		return imagesMap;
	}
	public void setImagesMap(Map<String, String> imagesMap) {
		this.imagesMap = imagesMap;
	}
	
}
