/**
 * 
 */
package com.action.hibernate.basics.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.action.hibernate.basics.Message;
import com.recipies.hibernate.basics.util.HibernateUtil;

/**
 * @author rajni.ubhi
 *
 */
public class MessageTest {
	public static void main(String[] args) {
		//insertMessage();
		listMessages();
	}

	static void insertMessage() {
		Session session = HibernateUtil.getSession();
		try {
			Transaction tx = session.beginTransaction();
			Message msg = new Message();
			msg.setMessageText("Hello World");
			msg.setNextMessage(new Message("Rajni here"));
			session.save(msg);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}

	}

	static void listMessages() {
		Session session = HibernateUtil.getSession();
		try {
			Transaction tx = session.beginTransaction();
			List<Message> msgList = session.createQuery("from Message m").getResultList();
			msgList.stream().forEach(System.out::println);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeResources();
		}
	}
}
