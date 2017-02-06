/**
 * 
 */
package com.rajni.inheritanceMapping.implicitpoly;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rajni.inheritanceMapping.implicitpolymorphism.BankAccount;
import com.rajni.inheritanceMapping.implicitpolymorphism.CreditCard;
import com.rajni.inheritanceMapping.implicitpolymorphism.User;
import com.rajni.inheritanceMapping.util.HibernateUtil;


/**
 * @author rajni.ubhi
 *
 */
public class ImplicitPolymorphismTest {
	public static void main(String[] args) {
	//	saveBankBillingDetails();
		System.out.println("Inserting credit card details");
	//	saveCreditBillingDetails();
		saveUserDetails();
	}
	
	static void saveCreditBillingDetails() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			CreditCard details = new CreditCard();
			details.setCardNumber("123456789963258");
			details.setExpiryMonth(12);
			details.setExpiryYear(2021);
			details.setOwner("Rajni");
			session.save(details);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
	
	static void saveBankBillingDetails() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			BankAccount details = new BankAccount();
			details.setAccountName("Rajni--Axis");
			details.setBankName("Axis");
			details.setOwner("Rajni");
			session.save(details);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
	
	static void saveUserDetails() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			User user = new User();
			user.setUserName("Rajni Ubhi");
			CreditCard details = session.get(CreditCard.class, 2l);
			user.setDetails(details);
			session.save(user);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
}
