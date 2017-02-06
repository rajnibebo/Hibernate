/**
 * 
 */
package com.rajni.hibernate_customtypes;

import java.math.BigDecimal;
import java.util.Currency;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rajni.hibernate_customtypes.compositeUserType.UserItem;
import com.rajni.hibernate_customtypes.userType.MonetaryAmount;
import com.rajni.hibernate_customtypes.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class CompositeUserType {
	public static void main(String[] args) {
		saveUserItem();
	}
	static void saveUserItem() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			UserItem userItem = new UserItem();
			userItem.setItemName("Laptop");
			userItem.setPrice(new MonetaryAmount(new BigDecimal(12365), Currency.getInstance("USD")));
			session.save(userItem);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
}
