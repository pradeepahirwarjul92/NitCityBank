package com.heg.test;

import org.hibernate.Session;

import com.heg.model.Order;
import com.heg.model.OrderId;
import com.heg.util.HibernateUtil;

public class LoadObjectDemo {

	public static void main(String[] args) {
		Session ses = null;
		Order order = null;
		OrderId id = null;

		ses = HibernateUtil.getSession();
		try {
			id = new OrderId();
			id.setOrderId(1L);
			id.setCustomerId(100l);
			order = ses.get(Order.class, id);
			if (order != null) {
				System.out.println("PRINT ORDER " + order);
			} else {
				System.out.println("NO RECORD FOUND :: ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.shutDownSession();
		}
	}

}
