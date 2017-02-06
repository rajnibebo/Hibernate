/**
 * 
 */
package com.hibernate.action.collectionmappings.list.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.action.collectionmappings.list.ImageList;
import com.hibernate.action.collectionmappings.list.ProductList;
import com.hibernate.action.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class ProductListTest {
	public static void main(String[] args) {
		saveProductList();
	}
	
	static void saveProductList() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			ProductList pList = new ProductList();
			pList.setProductName("Lenovo Vibe K5 Plus");
			
			ImageList img1 = new ImageList();
			img1.setImageLocation("images/mobile");
			img1.setImageName("V1.jpg");
			
			ImageList img2 = new ImageList();
			img2.setImageLocation("images/laptops");
			img2.setImageName("V1.jpg");
			
			ImageList img3 = new ImageList();
			img3.setImageLocation("images/mobile");
			img3.setImageName("V2.jpg");
			
			ImageList img4 = new ImageList();
			img4.setImageLocation("images/laptops");
			img4.setImageName("V2.jpg");
			
			List<ImageList> images = new ArrayList<ImageList>();
			images.add(img1);
			images.add(img2);
			images.add(img3);
			images.add(img4);
			
			pList.setImages(images);
			session.save(pList);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
}
