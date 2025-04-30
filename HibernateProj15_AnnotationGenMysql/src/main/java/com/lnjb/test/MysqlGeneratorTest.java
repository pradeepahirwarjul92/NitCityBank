package com.lnjb.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lnjb.model.Employee;
import com.lnjb.utils.HibernateUtil;

public class MysqlGeneratorTest {

	public static void main(String[] args) {

		Employee emp = null;
		Session ses = HibernateUtil.getSession();
		Transaction tx = null;
		boolean flag = false;
		try {
			tx = ses.beginTransaction();
			emp = new Employee();
			emp.setAge(32);
			emp.setEmpName("MYSQL IDENTITY");
			emp.setSalary(456585.0f);
			ses.save(emp);
			System.out.println("Employee saved with ID :: " + emp.getId());
			flag = true;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				tx.commit();
				;
			} else {
				tx.rollback();
				;
			}
		}

	}
}
