/**
 * 
 */
package com.rajni.hibernate_customtypes;

import java.math.BigDecimal;
import java.util.Currency;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rajni.hibernate_customtypes.parameterizedType.BidItem;
import com.rajni.hibernate_customtypes.userType.MonetaryAmount;
import com.rajni.hibernate_customtypes.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class ParameterizedTest {
	public static void main(String[] args) {
		saveBidItem();
	}
	
	static void saveBidItem() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			BidItem bidItem = new BidItem();
			bidItem.setItemName("Laptop");
			bidItem.setPrice(new MonetaryAmount(new BigDecimal(10000), Currency.getInstance("INR")));
			session.save(bidItem);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
}
