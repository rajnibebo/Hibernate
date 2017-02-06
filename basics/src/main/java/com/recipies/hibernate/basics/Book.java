/**
 * 
 */
package com.recipies.hibernate.basics;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "BOOK")
public class Book {
	@Id
	@GeneratedValue
	@Column(name = "BOOK_ID")
	private Long id;
	@Column(name = "BOOK_NAME")
	private String bookName;
	@Column(name = "PUBLISH_DATE")
	private Date publishDate;
	@Column(name = "PRICE")
	private Long price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	
}
