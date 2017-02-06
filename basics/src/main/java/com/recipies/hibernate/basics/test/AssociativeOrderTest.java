/**
 * 
 */
package com.recipies.hibernate.basics.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.recipies.hibernate.basics.embedding.AssociativeAddress;
import com.recipies.hibernate.basics.embedding.AssociativeContact;
import com.recipies.hibernate.basics.embedding.AssociativeOrder;
import com.recipies.hibernate.basics.embedding.AssociativePhone;
import com.recipies.hibernate.basics.pattern.AddressBuilder;
import com.recipies.hibernate.basics.pattern.EntityConverter;
import com.recipies.hibernate.basics.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class AssociativeOrderTest {
	public static void main(String[] args) {
		saveOrder();
	}

	static void saveOrder() {
		try {
			System.out.println("Starting session !!!!!!!!");
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			AssociativeOrder order = new AssociativeOrder();
			System.out.println("Transaction started !!!!!!");
			AssociativePhone billingPhone = new AssociativePhone();
			billingPhone.setAreaCode("91");
			billingPhone.setPhoneNumber("95698585");

			AssociativePhone shippingPhone = new AssociativePhone();
			shippingPhone.setAreaCode("91");
			shippingPhone.setPhoneNumber("7895478596");

			AssociativeAddress billingAddress = EntityConverter
					.getAddressConverter().convertT(
							new AddressBuilder().street("1").state("Punjab")
									.city("Ludhiana").country("India")
									.zipcode("141003").buildAddress());
			billingAddress.setPhone(billingPhone);
			AssociativeAddress shippingAddress = EntityConverter
					.getAddressConverter().convertT(
							new AddressBuilder().street("G-9").state("Punjab")
									.city("Chandigarh").country("India")
									.zipcode("16101").buildAddress());
			shippingAddress.setPhone(shippingPhone);
			AssociativeContact billingContact = new AssociativeContact();
			billingContact.setAddress(billingAddress);
			billingContact.setReceivedTime(new Date());
			billingContact.setRecipient("Cammie");
			
			AssociativeContact shippingContact = new AssociativeContact();
			shippingContact.setAddress(shippingAddress);
			shippingContact.setReceivedTime(new Date());
			shippingContact.setRecipient("Rajni");
			
			order.setBillingContact(billingContact);
			order.setShippingContact(shippingContact);
			order.setOrderTotal(12365.23);
			session.save(order);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
}
