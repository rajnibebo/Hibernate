/**
 * 
 */
package com.hibernate.action.collectionmappings.set;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author rajni.ubhi
 *
 */
@Embeddable
public class Image {
	@Column(name = "IMG_NAME")
	private String imageName;
	@Column(name = "IMG_LOC")
	private String imageLocation;
	@Column(name = "IMG_SIZE")
	private Long imageSize;

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImageLocation() {
		return imageLocation;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}

	public Long getImageSize() {
		return imageSize;
	}

	public void setImageSize(Long imageSize) {
		this.imageSize = imageSize;
	}

	public int hashCode() {
		return (imageLocation.hashCode() + imageName.hashCode() + imageSize
				.intValue()) * 31;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Image) {
			Image image = (Image) o;
			return image.imageLocation.equals(imageLocation) && image.imageName.equals(imageName)
					&& image.imageSize.equals(image.imageSize);
		}
		return false;
	}
}
