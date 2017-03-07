/**
 * 
 */
package org.rajni.ems.entities;


/**
 * @author rajni.ubhi
 *
 */
public interface IAddress {
	public Long getAddressId();

	public void setAddressId(Long addressId);

	public String getStreetNo();

	public void setStreetNo(String streetNo);

	public String getCity();

	public void setCity(String city);

	public String getState();

	public void setState(String state);

	public String getCountry();

	public void setCountry(String country);

	public String getZipcode();

	public void setZipcode(String zipcode);

	public IPhone getLandlineNumber();

	public void setLandlineNumber(IPhone landlineNumber);

	public IPhone getMobileNumber();

	public void setMobileNumber(IPhone mobileNumber);
}
