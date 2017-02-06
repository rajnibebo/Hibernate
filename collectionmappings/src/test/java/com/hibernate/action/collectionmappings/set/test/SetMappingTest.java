/**
 * 
 */
package com.hibernate.action.collectionmappings.set.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.action.collectionmappings.set.Image;
import com.hibernate.action.collectionmappings.set.Product;
import com.hibernate.action.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class SetMappingTest {
	public static void main(String[] args) {
		//saveCollectionOfSet();
		getImagesOfProduct();
	}
	
	static void saveCollectionOfSet() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			Product product = new Product();
			product.setPrice(123.65);
			product.setProductName("Lenovo Vibe");
			Image image = new Image();
			image.setImageLocation("images/mobile");
			image.setImageName("Lenovo.jpg");
			image.setImageSize(1235l);
			
			Image image1 = new Image();
			image1.setImageLocation("images/laptops");
			image1.setImageName("Lenovo.jpg");
			image1.setImageSize(1235l);
			
			product.addImage(image);
			product.addImage(image1);
			
			session.save(product);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
	
	static void getImagesOfProduct() {
		try {
			Session  session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			Product product = session.get(Product.class, 1l);
			System.out.println();
			System.out.println();
			System.out.print(product.getProductName()+" , Price :");
			System.out.println(product.getPrice());
			for(Image image : product.getImages()) {
				System.out.println(image.getImageName());
			}
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
}
