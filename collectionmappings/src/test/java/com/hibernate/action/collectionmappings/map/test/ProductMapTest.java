/**
 * 
 */
package com.hibernate.action.collectionmappings.map.test;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.action.collectionmappings.mapwithembedded.ImageMap;
import com.hibernate.action.collectionmappings.mapwithembedded.ProductMap;
import com.hibernate.action.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class ProductMapTest {
	public static void main(String[] args) {
		saveProductMap();
	}
	
	static void saveProductMap() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			ProductMap productMap = new ProductMap();
			productMap.setProductName("Hp Pavillion");
			
			ImageMap imageMap = new ImageMap();
			imageMap.setImageLocation("images/laptops");
			imageMap.setImageName("laptop.jpg");
			
			ImageMap imageMap1 = new ImageMap();
			imageMap1.setImageLocation("images/laptops");
			imageMap1.setImageName("laptop.png");
			
			ImageMap imageMap2 = new ImageMap();
			imageMap2.setImageLocation("images/laptops");
			imageMap2.setImageName("laptop.gif");
			
			Map<String, ImageMap> map = new HashMap<String, ImageMap>();
			map.put("10X10", imageMap);
			map.put("50X50", imageMap1);
			map.put("100X100", imageMap2);
			
			productMap.setImages(map);
			session.save(productMap);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
}
