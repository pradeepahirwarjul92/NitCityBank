package com.heg.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.heg.entity.User;
import com.heg.utils.HibernateUtil;

public class HibernateApp {

	public static void main(String[] args) {
		System.out.println("HibernateApp.main()");

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		System.out.println("HibernateApp.main() - 1 ");

		User user = new User("Pramod Ahirwar", "photographer@gmail.com");
		session.save(user);

		transaction.commit();

		session.close();
		HibernateUtil.shutdown();

		System.out.println("User Saved successfully with id :: " + user.getId());
	}

}
