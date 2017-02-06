/**
 * 
 */
package com.action.hibernate.customtypes;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Currency;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.BigDecimalType;
import org.hibernate.usertype.UserType;

/**
 * @author rajni.ubhi
 *
 */
public class MonetaryAmountUserType implements UserType {

	@Override
	public int[] sqlTypes() {
		// TODO Auto-generated method stub
		return new int[] { BigDecimalType.INSTANCE.sqlType()};
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
		BigDecimal amount = rs.getBigDecimal(names[0]);
		if(rs.wasNull()) {
			return null;
		}
		MonetaryAmount monetaryAmount = new MonetaryAmount(amount, Currency.getInstance("USD"));
		return monetaryAmount;
	}

	@Override
	public void nullSafeSet(PreparedStatement st, Object value, int index,
			SharedSessionContractImplementor session)
			throws HibernateException, SQLException {
		// TODO Auto-generated method stub
		if(value == null) {
			st.setNull(index, BigDecimalType.INSTANCE.sqlType());
		} else {
			MonetaryAmount amount = (MonetaryAmount) value;
			st.setBigDecimal(index, amount.getAmount());
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
	public Serializable disassemble(Object value) throws HibernateException {
		// TODO Auto-generated method stub
		return (Serializable) value;
	}

	@Override
	public Object assemble(Serializable cached, Object owner)
			throws HibernateException {
		// TODO Auto-generated method stub
		return cached;
	}

	@Override
	public Object replace(Object original, Object target, Object owner)
			throws HibernateException {
		// TODO Auto-generated method stub
		return original;
	}

}
