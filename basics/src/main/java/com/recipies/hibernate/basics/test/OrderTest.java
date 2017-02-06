/**
 * 
 */
package com.recipies.hibernate.basics.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.recipies.hibernate.basics.Address;
import com.recipies.hibernate.basics.Contact;
import com.recipies.hibernate.basics.Order;
import com.recipies.hibernate.basics.Phone;
import com.recipies.hibernate.basics.pattern.AddressBuilder;
import com.recipies.hibernate.basics.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class OrderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saveOrderDetails();
	}

	static void saveOrderDetails() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			Order order = new Order();
			Address billingAddress = new AddressBuilder().city("Ludhiana")
					.state("Punjab").country("India").street("1").zipcode("141003")
					.buildAddress();

			Address shippingAddress = new AddressBuilder().city("Chandigarh")
					.state("Punjab").country("India").street("G-9")
					.zipcode("160101").buildAddress();

			Phone billingPhone = new Phone();
			billingPhone.setAreaCode("91");
			billingPhone.setPhoneNumber("84125896");

			Phone shippingPhone = new Phone();
			shippingPhone.setAreaCode("91");
			shippingPhone.setPhoneNumber("123456987");

			Contact billingContact = new Contact();
			billingContact.setPhone(billingPhone);
			billingContact.setRecipient("Cammie");
			billingContact.setAddress(billingAddress);

			Contact shippContact = new Contact();
			shippContact.setAddress(shippingAddress);
			shippContact.setPhone(shippingPhone);
			shippContact.setRecipient("Rajni");

			order.setBillingContact(billingContact);
			order.setShippingContact(shippContact);
			order.setOrderTotal(1235.25);
			session.save(order);
			tx.commit();
		} catch (Exception e) {
			System.out.println("Exception Thrown !!!!!!!");
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
		
		
	}

}
