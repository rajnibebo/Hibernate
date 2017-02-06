/**
 * 
 */
package com.rajni.inheritanceMapping.tableperclasshierarchy;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rajni.inheritanceMapping.tableperclasshierachy.Bank;
import com.rajni.inheritanceMapping.tableperclasshierachy.Credit;
import com.rajni.inheritanceMapping.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class SingleTableMappingTest {
	public static void main(String[] args) {
		saveBillingDetails();
	}
	
	static void saveBillingDetails() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			Credit credit = new Credit();
			credit.setCreditCardNumber("123456899655");
			credit.setExpiryMonth(12);
			credit.setExpiryYear(2365);
			credit.setOwner("Rajni");
			session.save(credit);
			
			Bank bank = new Bank();
			bank.setBankAccount("adhsdjas11565623");
			bank.setBankName("Axis");
			bank.setOwner("Rajni Ubhi");
			session.save(bank);
			tx.commit();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
}
