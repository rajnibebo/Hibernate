/**
 * 
 */
package com.recipies.hibernate.basics.pattern;

import org.recipies.hibernate.basics.pattern.IEntityConverter;

import com.recipies.hibernate.basics.Address;
import com.recipies.hibernate.basics.embedding.AssociativeAddress;
import com.recipies.hibernate.basics.embeddingassociations.EmployeeAddress;

/**
 * @author rajni.ubhi
 *
 */
public class EntityConverter {
	private EntityConverter() {
	}

	public static IEntityConverter<AssociativeAddress, Address> getAddressConverter() {
		return new AddressConverter();
	}
	
	public static IEntityConverter<EmployeeAddress, Address> getEmployeeAddressConverter() {
		return new EmployeeAddressConverter();
	}

	static class AddressConverter implements IEntityConverter<AssociativeAddress, Address> {

		@Override
		public AssociativeAddress convertT(Address f) {
			// TODO Auto-generated method stub
			AssociativeAddress address = new AssociativeAddress();
			address.setCity(f.getCity());
			address.setCountry(f.getCountry());
			address.setState(f.getState());
			address.setStreet(f.getStreet());
			address.setZipcode(f.getZipcode());
			return address;
		}

		@Override
		public Address convertF(AssociativeAddress t) {
			// TODO Auto-generated method stub
			return null;
		}

	}
	
	static class EmployeeAddressConverter implements IEntityConverter<EmployeeAddress, Address> {

		@Override
		public EmployeeAddress convertT(Address f) {
			// TODO Auto-generated method stub
			EmployeeAddress address = new EmployeeAddress();
			address.setCity(f.getCity());
			address.setCountry(f.getCountry());
			address.setState(f.getState());
			address.setStreet(f.getStreet());
			address.setZipcode(f.getZipcode());
			return address;
		}

		@Override
		public Address convertF(EmployeeAddress t) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
