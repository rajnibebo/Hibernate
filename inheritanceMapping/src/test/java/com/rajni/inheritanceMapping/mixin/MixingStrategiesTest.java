/**
 * 
 */
package com.rajni.inheritanceMapping.mixin;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rajni.inheritanceMapping.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class MixingStrategiesTest {
	public static void main(String[] args) {
		save();
	}
	static void save() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			CreditCardInfo cardInfo = new CreditCardInfo();
			cardInfo.setCardNumber("54656532325");
			cardInfo.setExpiryMonth(12);
			cardInfo.setExpiryYear(2055);
			cardInfo.setOwner("Rajni Ubhi");
			
			BankAccountInfo accountInfo = new BankAccountInfo();
			accountInfo.setBankAccountNumber("569865635989");
			accountInfo.setBankName("Axis");
			accountInfo.setOwner("Rajni Ubhi");
			session.save(accountInfo);
			session.save(cardInfo);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
}
