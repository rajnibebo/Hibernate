/**
 * 
 */
package org.rajni.ems.company;

import java.util.Set;

/**
 * @author rajni.ubhi
 *
 */
public interface ICompany {
	public Long getCompanyId() ;

	public void setCompanyId(Long companyId) ;

	public String getCompanyName() ;

	public void setCompanyName(String companyName) ;

	public Set<ICompanyUnit> getCompanyUnits() ;

	public void setCompanyUnits(Set<ICompanyUnit> companyUnits) ;
}
