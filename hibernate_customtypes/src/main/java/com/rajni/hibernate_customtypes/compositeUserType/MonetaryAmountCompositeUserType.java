/**
 * 
 */
package com.rajni.hibernate_customtypes.compositeUserType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Currency;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.BigDecimalType;
import org.hibernate.type.CurrencyType;
import org.hibernate.type.Type;
import org.hibernate.usertype.CompositeUserType;

import com.rajni.hibernate_customtypes.userType.MonetaryAmount;

/**
 * @author rajni.ubhi
 *
 */
public class MonetaryAmountCompositeUserType implements CompositeUserType {

	@Override
	public String[] getPropertyNames() {
		// TODO Auto-generated method stub
		return new String[] { "amount", "currency" };
	}

	@Override
	public Type[] getPropertyTypes() {
		// TODO Auto-generated method stub
		return new Type[] { BigDecimalType.INSTANCE, CurrencyType.INSTANCE };
	}

	@Override
	public Object getPropertyValue(Object component, int property)
			throws HibernateException {
		// TODO Auto-generated method stub
		MonetaryAmount monetaryAmount = (MonetaryAmount) component;
		if(property == 0) {
			return monetaryAmount.getAmount();
		} 
		if(property == 1) {
			return monetaryAmount.getCurrency();
		}
		return null;
	}

	@Override
	public void setPropertyValue(Object component, int property, Object value)
			throws HibernateException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Immuatble class can not be altered");
	}

	@Override
	public Class<?> returnedClass() {
		// TODO Auto-generated method stub
		return MonetaryAmount.class;
	}

	@Override
	public boolean equals(Object x, Object y) throws HibernateException {
		// TODO Auto-generated method stub
		if(x == y) {
			return true;
		}
		if(x == null || y == null) {
			return false;
		} 
		return x.equals(y);
	}

	@Override
	public int hashCode(Object x) throws HibernateException {
		// TODO Auto-generated method stub
		return x.hashCode();
	}

	@Override
	public Object nullSafeGet(ResultSet rs, String[] names,
			SharedSessionContractImplementor session, Object owner)
			throws HibernateException, SQLException {
		// TODO Auto-generated method stub
		BigDecimal value = rs.getBigDecimal(names[0]);
		if(rs.wasNull()) {
			return null;
		}
		Currency currency = Currency.getInstance(rs.getString(names[1]));
		return new MonetaryAmount(value, currency);
	}

	@Override
	public void nullSafeSet(PreparedStatement st, Object value, int index,
			SharedSessionContractImplementor session)
			throws HibernateException, SQLException {
		// TODO Auto-generated method stub
		if(value == null) {
			st.setNull(index, BigDecimalType.INSTANCE.sqlType());
			st.setNull(index+1, CurrencyType.INSTANCE.sqlType());
		} else {
			MonetaryAmount monetaryAmount = (MonetaryAmount) value;
			st.setBigDecimal(index, monetaryAmount.getAmount());
			st.setString(index+1, monetaryAmount.getCurrency().getCurrencyCode());
		}
	}

	@Override
	public Object deepCopy(Object value) throws HibernateException {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public boolean isMutable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Serializable disassemble(Object value,
			SharedSessionContractImplementor session) throws HibernateException {
		// TODO Auto-generated method stub
		return (Serializable) value;
	}

	@Override
	public Object assemble(Serializable cached,
			SharedSessionContractImplementor session, Object owner)
			throws HibernateException {
		// TODO Auto-generated method stub
		return cached;
	}

	@Override
	public Object replace(Object original, Object target,
			SharedSessionContractImplementor session, Object owner)
			throws HibernateException {
		// TODO Auto-generated method stub
		return original;
	}

}
