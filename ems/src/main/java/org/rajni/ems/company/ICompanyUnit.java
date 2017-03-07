/**
 * 
 */
package org.rajni.ems.company;

import java.util.Date;
import java.util.Set;

import org.rajni.ems.employee.IEmployee;
import org.rajni.ems.entities.IAddress;

/**
 * @author rajni.ubhi
 *
 */
public interface ICompanyUnit {
	public Long getCompanyUnitId();

	public void setCompanyUnitId(Long companyUnitId);

	public String getCompanyUnitName();

	public void setCompanyUnitName(String companyUnitName);

	public IAddress getCompanyUnitAddress();

	public void setCompanyUnitAddress(IAddress companyUnitAddress);

	public Date getEstablishedDate();

	public void setEstablishedDate(Date establishedDate);

	public int getNumberOfEmployees();

	public void setNumberOfEmployees(int numberOfEmployees);

	public Set<IEmployee> getEmployees();

	public void setEmployees(Set<IEmployee> employees);
}
