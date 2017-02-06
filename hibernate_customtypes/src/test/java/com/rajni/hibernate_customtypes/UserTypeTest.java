/**
 * 
 */
package com.rajni.hibernate_customtypes;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rajni.hibernate_customtypes.userType.Item;
import com.rajni.hibernate_customtypes.userType.MonetaryAmount;
import com.rajni.hibernate_customtypes.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class UserTypeTest {
	public static void main(String[] args) {
		//saveItemDetails();
		getDetails();
	}
	static void saveItemDetails() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			Item item = new Item();
			item.setItemName("Laptop");
			item.setInitialPrice(new MonetaryAmount(new BigDecimal(35000), Currency.getInstance("USD")));
			session.save(item);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
	
	@SuppressWarnings("unchecked")
	static void getDetails() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			List<Item> items = session.createQuery("from Item").getResultList();
			for(Item item : items) {
				System.out.println("Item :"+item.getItemName()+",price:"+item.getInitialPrice().getAmount());
			}
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
}
