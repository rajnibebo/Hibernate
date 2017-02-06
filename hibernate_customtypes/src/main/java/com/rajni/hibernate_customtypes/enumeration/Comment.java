/**
 * 
 */
package com.rajni.hibernate_customtypes.enumeration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "COMMENT")
@TypeDef(name = "rating", typeClass = StringEnumUserType.class, parameters = 
	@Parameter(name = "enumclassname", value = "com.rajni.hibernate_customtypes.enumeration.Rating"))
public class Comment {
	@Id
	@GeneratedValue
	@Column(name = "COMMENT_ID")
	private Long commentId;

	@Type(type = "rating")
	@Column(name = "RATING")
	private Rating rating;

	@Column(name = "USER_NAME")
	private String userName;

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

}
