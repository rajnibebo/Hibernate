/**
 * 
 */
package com.hibernate.action.collectionmappings.mapsorted;

import java.util.Comparator;

/**
 * @author rajni.ubhi
 *
 */
public class ImageComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}

}
