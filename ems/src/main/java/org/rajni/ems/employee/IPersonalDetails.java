/**
 * 
 */
package org.rajni.ems.employee;

import java.util.Date;

import com.rajni.ems.entities.employee.Gender;
import com.rajni.ems.entities.employee.MaritalStatus;

/**
 * @author rajni.ubhi
 *
 */
public interface IPersonalDetails {
	public Long getEmployeeID();

	public void setEmpId(Long employeeID);

	public String getFirstName();

	public void setFirstName(String firstName);

	public String getLastName();

	public void setLastName(String lastName);

	public int getAge();

	public void setAge(int age);

	public Date getDateOfBirth();

	public void setDateOfBirth(Date dateOfBirth);

	public Gender getGender();

	public void setGender(Gender gender);

	public MaritalStatus getMaritalStatus();

	public void setMaritalStatus(MaritalStatus maritalStatus);

	public String getMotherName();

	public void setMotherName(String motherName);

	public String getFatherName();

	public void setFatherName(String fatherName);

	public String getSpouseName();

	public void setSpouseName(String spouseName);

}
