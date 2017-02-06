/**
 * 
 */
package com.hibernate.action.collectionmappings.list;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author rajni.ubhi
 *
 */
@Embeddable
public class ImageList {
	@Column(name = "IMAGE_NAME")
	private String imageName;
	@Column(name = "IMAGE_LOCATION")
	private String imageLocation;
	//@Column(name = "IMG_IDX")
	//private int imageIndex;
	
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
	
}
