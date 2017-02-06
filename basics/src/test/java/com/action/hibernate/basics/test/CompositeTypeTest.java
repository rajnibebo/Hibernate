/**
 * 
 */
package com.action.hibernate.basics.test;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.action.hibernate.customtypes.BuyerItem;
import com.action.hibernate.customtypes.MonetaryAmount;
import com.recipies.hibernate.basics.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class CompositeTypeTest {
	public static void main(String[] args) {
		saveCustomType();
		//retrieveItem();
	}
	static void saveCustomType() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			BuyerItem item = new BuyerItem();
			item.setItemName("Stationary");
			item.setInitialAmount(new MonetaryAmount(new BigDecimal(1258), Currency.getInstance("USD")));
			session.save(item);
			
			List<BuyerItem> items = session.createQuery("from BuyerItem b").getResultList();
			items.stream().forEach(System.out::println);
			
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
	
	static void retrieveItem() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			List<BuyerItem> items = session.createQuery("from BuyerItem b").getResultList();
			items.stream().forEach(System.out::println);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
	
}
