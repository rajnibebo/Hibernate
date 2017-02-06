/**
 * 
 */
package com.hibernate.action.collectionmappings.idbag.test;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.action.collectionmappings.idbag.ImageBag;
import com.hibernate.action.collectionmappings.idbag.ProductBag;
import com.hibernate.action.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class IDBagTest {
	public static void main(String[] args) {
		//saveProductBag();
		getProductBag();
	}
	
	static void saveProductBag() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			ProductBag productBag = new ProductBag();
			productBag.setProductName("Lenovo");
			
			ImageBag imBag1 = new ImageBag();
			imBag1.setImageLocation("images/mobile");
			imBag1.setImageName("V1.jpg");
			
			ImageBag imBag2 = new ImageBag();
			imBag2.setImageLocation("images/laptop");
			imBag2.setImageName("V2.jpg");
			
			ImageBag imBag3 = new ImageBag();
			imBag3.setImageLocation("images/mobile");
			imBag3.setImageName("V2.jpg");
			
			Collection<ImageBag> collection = new ArrayList<ImageBag>();
			collection.add(imBag1);
			collection.add(imBag2);
			collection.add(imBag3);
			
			productBag.setImages(collection);
			session.save(productBag);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
	
	static void getProductBag() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			ProductBag productBag = session.get(ProductBag.class, 10l);
			System.out.println();
			System.out.println();
			System.out.println(productBag.getProductName());
			System.out.println();
			for(ImageBag bag : productBag.getImages()) {
				System.out.print("\t\t"+bag.getImageLocation()+" ---- ");
				System.out.println(bag.getImageName());
			}
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
}
