/**
 * 
 */
package com.rajni.ems.entities.employee.test;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rajni.ems.entities.company.CompanyUnit;
import com.rajni.ems.entities.employee.Employee;
import com.rajni.ems.entities.employee.Gender;
import com.rajni.ems.entities.employee.MaritalStatus;
import com.rajni.ems.entities.employee.PersonalDetails;
import com.rajni.ems.entities.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			Employee employee = saveEmployee();
			employee.setCompanyUnit(session.get(CompanyUnit.class, 2l));
			session.persist(employee);
			PersonalDetails personalDetails = personalDetails();
			personalDetails.setEmpId(employee.getEmpId());
			employee.setPersonalDetails(personalDetails);
			session.save(employee);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
	public static Employee saveEmployee() {
		Employee employee = new Employee();
		employee.setDateOfJoining(getDate(7, 11, 2016));
		return employee;
	}
	public static PersonalDetails personalDetails() {
		PersonalDetails details = new PersonalDetails();
		details.setFatherName("Manjit Singh");
		details.setMotherName("Ranbir Kaur");
		details.setFirstName("Rajni");
		details.setLastName("Ubhi");
		details.setGender(Gender.FEMALE);
		details.setMaritalStatus(MaritalStatus.SINGLE);
		details.setDateOfBirth(getDate(24, 9, 1993));
		return details;
	}
	static Date getDate(int day,int month,int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.MONTH, month-1);
		calendar.set(Calendar.YEAR, year);
		return calendar.getTime();
	}
//	static CompanyUnit companyUnit() {
//		try {
//			Session session = HibernateUtil.getSession();
//			Transaction tx = session.beginTransaction();
//			CompanyUnit unit = session.get(CompanyUnit.class, 2l);
//			tx.commit();
//			return unit;
//		} catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			
//		}
//		return null;
//	}
}
