package com.lnjb.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lnjb.model.Student;
import com.lnjb.utils.HibernateUtil;

public class TableGeneratorTest {
	public static void main(String[] args) {

		Student student = null;
		Session ses = HibernateUtil.getSession();
		Transaction tx = null;
		boolean flag = false;

		try {
			tx = ses.beginTransaction();
			student = new Student();
			student.setName("PRADEEP AHIRWAR");
			ses.save(student);
			flag = true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (flag)
				tx.commit();
			else
				tx.rollback();
		}

	}

}
