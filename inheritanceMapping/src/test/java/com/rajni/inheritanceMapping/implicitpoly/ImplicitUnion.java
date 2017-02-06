package com.rajni.inheritanceMapping.implicitpoly;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rajni.inheritanceMapping.implicitunion.ResidentialAddress;
import com.rajni.inheritanceMapping.implicitunion.User1;
import com.rajni.inheritanceMapping.util.HibernateUtil;

public class ImplicitUnion {
	public static void main(String[] args) {
		saveResidentialAddress();
	}
	
	static void saveResidentialAddress() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			ResidentialAddress residentialAddress = new ResidentialAddress();
			residentialAddress.setCity("Chandigarh");
			residentialAddress.setCountry("India");
			residentialAddress.setState("Punjab");
			residentialAddress.setStreetNo("1");
			residentialAddress.setZipcode("160101");
			User1 user = new User1();
			user.setUserName("Rajni");
			user.setUserAddress(residentialAddress);
			session.save(user);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
}
