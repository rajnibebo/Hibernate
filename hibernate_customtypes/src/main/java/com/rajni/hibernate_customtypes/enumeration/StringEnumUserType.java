/**
 * 
 */
package com.rajni.hibernate_customtypes.enumeration;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.internal.util.ReflectHelper;
import org.hibernate.type.StringType;
import org.hibernate.usertype.EnhancedUserType;
import org.hibernate.usertype.ParameterizedType;

/**
 * @author rajni.ubhi
 *
 */
public class StringEnumUserType implements EnhancedUserType,ParameterizedType {
	private Class<Enum> enumClass;
	
	@Override
	public int[] sqlTypes() {
		// TODO Auto-generated method stub
		return new int[] { StringType.INSTANCE.sqlType()};
	}

	@Override
	public Class<?> returnedClass() {
		// TODO Auto-generated method stub
		return enumClass;
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
		String val = rs.getString(names[0]);
		return rs.wasNull()? null: Enum.valueOf(enumClass, val);
	}

	@Override
	public void nullSafeSet(PreparedStatement st, Object value, int index,
			SharedSessionContractImplementor session)
			throws HibernateException, SQLException {
		// TODO Auto-generated method stub
		if(value == null) {
			st.setNull(index, StringType.INSTANCE.sqlType());
		} else {
			st.setString(index, ((Enum)value).name());
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

	@Override
	public String objectToSQLString(Object value) {
		// TODO Auto-generated method stub
		return '\'' + ( (Enum) value ).name() + '\'';
	}

	@Override
	public String toXMLString(Object value) {
		// TODO Auto-generated method stub
		return ((Enum) value).name();
	}

	@Override
	public Object fromXMLString(String xmlValue) {
		// TODO Auto-generated method stub
		return Enum.valueOf( enumClass,xmlValue);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public void setParameterValues(Properties parameters) {
		// TODO Auto-generated method stub
		String enumClassName = parameters.getProperty("enumclassname");
		try {
			this.enumClass = ReflectHelper.classForName(enumClassName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
