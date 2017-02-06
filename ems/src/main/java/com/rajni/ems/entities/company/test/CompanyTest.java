/**
 * 
 */
package com.rajni.ems.entities.company.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rajni.ems.entities.Address;
import com.rajni.ems.entities.Phone;
import com.rajni.ems.entities.company.Company;
import com.rajni.ems.entities.company.CompanyUnit;
import com.rajni.ems.entities.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class CompanyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		try {
			Transaction tx = session.beginTransaction();
			session.save(saveCompany());
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}

	static Company saveCompany() {
		Address companyUnitAddress1 = new Address();
		companyUnitAddress1.setCity("Chandigarh");
		companyUnitAddress1.setCountry("India");
		companyUnitAddress1.setState("Punjab");
		companyUnitAddress1.setStreetNo("G-9");
		companyUnitAddress1.setZipcode("160101");

		Phone landlinePhone = new Phone();
		landlinePhone.setAreaCode("0162");
		landlinePhone.setPhoneNumber("123456");

		Phone mobilePhone = new Phone();
		mobilePhone.setAreaCode("91");
		mobilePhone.setPhoneNumber("9874561230");

		companyUnitAddress1.setLandlineNumber(landlinePhone);
		companyUnitAddress1.setMobileNumber(mobilePhone);

		Address companyUnitAddress2 = new Address();
		companyUnitAddress2.setCity("San Jose");
		companyUnitAddress2.setCountry("USA");
		companyUnitAddress2.setState("California");
		companyUnitAddress2.setStreetNo("209 Ave");
		companyUnitAddress2.setZipcode("90005");

		Phone landlinePhone1 = new Phone();
		landlinePhone1.setAreaCode("01");
		landlinePhone1.setPhoneNumber("987456");

		Phone mobilePhone1 = new Phone();
		mobilePhone1.setAreaCode("114");
		mobilePhone1.setPhoneNumber("147852");

		companyUnitAddress2.setLandlineNumber(landlinePhone1);
		companyUnitAddress2.setMobileNumber(mobilePhone1);

		CompanyUnit unit1 = new CompanyUnit();
		unit1.setCompanyUnitAddress(companyUnitAddress1);
		unit1.setCompanyUnitName("Continumm");
		unit1.setEstablishedDate(new Date());

		CompanyUnit unit2 = new CompanyUnit();
		unit2.setCompanyUnitAddress(companyUnitAddress2);
		unit2.setCompanyUnitName("Global Info");
		unit2.setEstablishedDate(new Date());

		Company company = new Company();
		company.setCompanyName("Trantor");
		company.getCompanyUnits().add(unit1);
		company.getCompanyUnits().add(unit2);
		return company;
	}
}
