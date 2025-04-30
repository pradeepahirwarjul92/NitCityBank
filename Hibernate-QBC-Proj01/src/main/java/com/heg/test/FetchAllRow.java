package com.heg.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.heg.model.ParticipantsModel;
import com.heg.utils.HibernateUtil;

public class FetchAllRow {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();

		Query query = session.createQuery("FROM ParticipantsModel");
		// List<ParticipantsModel> participants=query.list();
		List<ParticipantsModel> list1 = query.list(); // Uses open JDBC connection

		list1.forEach(e-> System.out.println(e.getTraining_title()));
		

		HibernateUtil.shutdown();

	}

}
