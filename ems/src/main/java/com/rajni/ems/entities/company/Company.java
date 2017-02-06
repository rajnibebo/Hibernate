/**
 * 
 */
package com.rajni.ems.entities.company;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "COMPANY")
public class Company {
	@Id
	@GeneratedValue
	@Column(name = "COMPANY_ID")
	private Long companyId;
	@Column(name = "COMPANY_NAME")
	private String companyName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "COMP_REF_ID", nullable = false)
	private Set<CompanyUnit> companyUnits = new HashSet<CompanyUnit>();

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Set<CompanyUnit> getCompanyUnits() {
		return companyUnits;
	}

	public void setCompanyUnits(Set<CompanyUnit> companyUnits) {
		this.companyUnits = companyUnits;
	}

}
