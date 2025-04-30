package com.heg.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.heg.model.Order;
import com.heg.model.OrderId;
import com.heg.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {

		Order order = null;
		OrderId orderId = null;
		boolean flag = false;
		Transaction tx = null;
		Session ses = HibernateUtil.getSession();
		try {
			System.out.println("Test.main()");
			orderId = new OrderId(4L, 104L);
			order = new Order(orderId, "LICENSES");
			tx = ses.beginTransaction();
			orderId =(OrderId) ses.save(order);
			System.out.println("RECORD SAVED WITH RESPECTIVE ID :: " +orderId);
			System.out.println();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				tx.commit();
			} else {
				tx.rollback();
			}
		}

	}

}
