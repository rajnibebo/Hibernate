/**
 * 
 */
package com.recipies.hibernate.basics.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.recipies.hibernate.basics.embeddingassociations.Employee;
import com.recipies.hibernate.basics.embeddingassociations.EmployeeAddress;
import com.recipies.hibernate.basics.embeddingassociations.EmployeeContact;
import com.recipies.hibernate.basics.embeddingassociations.EmployeePhone;
import com.recipies.hibernate.basics.pattern.AddressBuilder;
import com.recipies.hibernate.basics.pattern.EntityConverter;
import com.recipies.hibernate.basics.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class EmployeeTest {
	public static void main(String[] args) {
		saveEmployee();
	}

	static void saveEmployee() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			EmployeePhone homePhone = new EmployeePhone();
			homePhone.setAreaCode("91");
			homePhone.setPhoneNumber("123456789");

			EmployeePhone currentPhone = new EmployeePhone();
			currentPhone.setAreaCode("0162");
			currentPhone.setPhoneNumber("1234567895");

			EmployeeAddress homeAddress = EntityConverter
					.getEmployeeAddressConverter().convertT(
							new AddressBuilder().street("1").state("Punjab")
									.city("Ludhiana").country("India")
									.zipcode("141003").buildAddress());
			
			EmployeeAddress currentAddress = EntityConverter
					.getEmployeeAddressConverter().convertT(
							new AddressBuilder().street("G-9").state("Punjab")
									.city("Chandigarh").country("India")
									.zipcode("160101").buildAddress());
			
			EmployeeContact homeContact = new EmployeeContact();
			homeContact.setAddress(homeAddress);
			homeContact.setPhone(homePhone);
			
			EmployeeContact currentContact = new EmployeeContact();
			currentContact.setAddress(currentAddress);
			currentContact.setPhone(currentPhone);
			
			Employee employee = new Employee();
			employee.setAge(23);
			employee.setCurrentContact(currentContact);
			employee.setHomeContact(homeContact);
			employee.setName("Rajni");
			session.save(employee);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
}
