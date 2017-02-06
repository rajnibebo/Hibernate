/**
 * 
 */
package com.recipies.hibernate.basics.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.recipies.hibernate.basics.Customer;
import com.recipies.hibernate.basics.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class CustomerTest {
	public static void main(String[] args) {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			Customer customer = new Customer();
			customer.setFirstName("Rajni");
			customer.setMiddleName("Kaur");
			customer.setLastName("Ubhi");
			session.save(customer);
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Closing Resources !!!!!!!!!!");
			HibernateUtil.closeResources();
		}
		
	}
}
