package com.heg.test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.heg.entity.PersonInfo1;
import com.heg.utils.HibernateUtils;

public class TestDemo {

	public static void main(String[] args) {
		PersonInfo1 info = null;
		Transaction tx = null;
		boolean flag = false;
		Session ses = HibernateUtils.getSession();
		info = new PersonInfo1();
		info.setPname("PRADEEP Ahirwar");
		info.setPaddrs("Bhopal");

		LocalDate dob = LocalDate.of(1992, 7, 10);
		info.setDob(Date.from(dob.atStartOfDay(ZoneId.systemDefault()).toInstant()));

		info.setDoj(new Date());

		LocalDate dom = LocalDate.of(2018, 6, 20);
		info.setDom(Date.from(dom.atStartOfDay(ZoneId.systemDefault()).toInstant()));

		try {

			tx = ses.beginTransaction();
			ses.save(info);
			flag = true;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag)
				tx.commit();
			else
				tx.rollback();

			HibernateUtils.shutDownSession();
		}
	}

}
