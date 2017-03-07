/**
 * 
 */
package org.rajni.ems.entities;

/**
 * @author rajni.ubhi
 *
 */
public interface IDesignation {
	public Long getDesignationId();

	public void setDesignationId(Long designationId);

	public String getDesignationName();

	public void setDesignationName(String designationName);

	public int getExperienceRequired();

	public void setExperienceRequired(int experienceRequired);

	public Double getSalaryOffered();

	public void setSalaryOffered(Double salaryOffered);
}
