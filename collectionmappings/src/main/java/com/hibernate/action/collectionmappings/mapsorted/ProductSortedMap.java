/**
 * 
 */
package com.hibernate.action.collectionmappings.mapsorted;

import java.util.SortedMap;
import java.util.TreeMap;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.SortComparator;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "PRODUCT_SORTED_MAP")
public class ProductSortedMap {
	@Id
	@GeneratedValue
	@Column(name = "PRODUCT_ID")
	private Long productId;
	@Column(name = "PRODUCT_NAME")
	private String productName;
	@ElementCollection
	@CollectionTable(name = "PRODUCT_SORTED_IMAGES",joinColumns = @JoinColumn(name = "PROD_ID"))
	@SortComparator(value=ImageComparator.class)
	@OrderBy("imageName DESC")
	@MapKeyColumn(name = "IMAGE_SIZE")
	private SortedMap<String, ImageSorted> map = new TreeMap<String, ImageSorted>();
	
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
	public SortedMap<String, ImageSorted> getMap() {
		return map;
	}
	public void setMap(SortedMap<String, ImageSorted> map) {
		this.map = map;
	}
	
}
