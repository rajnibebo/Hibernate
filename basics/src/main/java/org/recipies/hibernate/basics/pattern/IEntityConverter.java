/**
 * 
 */
package org.recipies.hibernate.basics.pattern;

/**
 * @author rajni.ubhi
 *
 */
public interface IEntityConverter<T,F> {
	public T convertT(F f);
	
	public F convertF(T t);
}
