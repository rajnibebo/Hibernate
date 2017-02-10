/**
 * 
 */
package com.hibernate.action.collectionmappings.map.test;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.action.collectionmappings.map.ProductMapSimple;
import com.hibernate.action.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class ProductMapSimpleTest {
	public static void main(String[] args) {
		saveProductMapSimple();
	}
	static void saveProductMapSimple() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			ProductMapSimple productMapSimple = new ProductMapSimple();
			productMapSimple.setProductName("Lenovo k5 plus");
			Map<String, String> map = new HashMap<String, String>();
			map.put("logo.png", "images/mobile");
			map.put("logo.jpg", "images/mobile");
			productMapSimple.setImagesMap(map);
			session.save(productMapSimple);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
}
