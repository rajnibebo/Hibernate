/**
 * 
 */
package com.recipies.hibernate.basics.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.recipies.hibernate.basics.Book;
import com.recipies.hibernate.basics.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class BookTest {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Book book = new Book();
		book.setBookName("Hibernate Recipies");
		book.setPrice(1235l);
		book.setPublishDate(new Date());
		session.save(book);
		tx.commit();
		HibernateUtil.closeResources();
	}
}
