/**
 * 
 */
package com.hibernate.action.collectionmappings.map.test;

import java.util.SortedMap;
import java.util.TreeMap;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.action.collectionmappings.mapsorted.ImageSorted;
import com.hibernate.action.collectionmappings.mapsorted.ProductSortedMap;
import com.hibernate.action.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class ProductSortedMapTest {
	public static void main(String[] args) {
		//saveSortedProductMap();
		retrieveOrdered();
	}
	static void saveSortedProductMap() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			ProductSortedMap pMap = new ProductSortedMap();
			pMap.setProductName("Lenovo Vibe k5 plus");
			
			ImageSorted image1 = new ImageSorted();
			image1.setImageLocation("image/mobile");
			image1.setImageName("logo.jpg");
			ImageSorted image2 = new ImageSorted();
			image2.setImageLocation("image/mobile");
			image2.setImageName("logo.png");
			ImageSorted image3 = new ImageSorted();
			image3.setImageLocation("image/mobile");
			image3.setImageName("logo.gif");
			
			SortedMap<String, ImageSorted> map = new TreeMap<String, ImageSorted>();
			map.put("10X10", image1);
			map.put("50X50", image2);
			map.put("100X100", image3);
			
			pMap.setMap(map);
			session.save(pMap);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
	
	static void retrieveOrdered() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			ProductSortedMap productSortedMap = session.get(ProductSortedMap.class, 31l);
			System.out.println(productSortedMap.getProductName());
			System.out.println(productSortedMap.getMap());
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
}
