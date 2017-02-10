/**
 * 
 */
package com.hibernate.action.collectionmappings.mapsorted;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author rajni.ubhi
 *
 */
@Embeddable
public class ImageSorted {
	@Column(name = "IMAGE_NAME")
	private String imageName;
	@Column(name = "IMAGE_LOCATION")
	private String imageLocation;
	
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
	
	public String toString() {
		return imageName;
	}
	
}
