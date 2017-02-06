/**
 * 
 */
package com.rajni.inheritanceMapping.tablepersubclass;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rajni.inheritanceMapping.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class TablePerSubclassTest {
	public static void main(String[] args) {
		saveBill();
	}
	public static void saveBill() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			Account account = new Account();
			account.setAccountName("shjsdh55632233268");
			account.setBankName("Axis");
			account.setOwner("Rajni");
			session.save(account);
			
			Card card = new Card();
			card.setCreditCardNumber("45983269863248962");
			card.setExpiryMonth(12);
			card.setExpiryYear(2365);
			card.setOwner("Rajni");
			session.save(card);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
}
