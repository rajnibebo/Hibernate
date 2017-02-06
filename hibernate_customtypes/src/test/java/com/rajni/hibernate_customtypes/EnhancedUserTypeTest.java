/**
 * 
 */
package com.rajni.hibernate_customtypes;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rajni.hibernate_customtypes.enumeration.Comment;
import com.rajni.hibernate_customtypes.enumeration.Rating;
import com.rajni.hibernate_customtypes.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class EnhancedUserTypeTest {
	public static void main(String[] args) {
		//saveComment();
		getExcellentComments();
	}
	static void saveComment() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			Comment comment = new Comment();
			comment.setUserName("Rajni Ubhi");
			comment.setRating(Rating.EXCELLENT);
			session.save(comment);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
	static void getExcellentComments() {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			List<Comment> comments = session.createQuery("from Comment c where c.rating = com.rajni.hibernate_customtypes.enumeration.Rating.EXCELLENT").getResultList();
			for(Comment comment : comments) {
				System.out.println(comment.getUserName());
			}
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
}
