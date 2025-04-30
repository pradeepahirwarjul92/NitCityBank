package com.heg.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.heg.model.ParticipantsModel;
import com.heg.utils.HibernateUtil;

public class FetchSpecificColumn {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();

		try {

			Query query = session
					.createQuery("SELECT sch_id, sch_fdate, training_title FROM ParticipantsModel WHERE sch_id > ?1 ");
			query.setParameter(1, 1803L);

			List<Object[]> results = query.list();

			for (Object[] row : results) {
				Long name = (Long) row[0];
				String email = (String) row[2];
				System.out.println("Name: " + name + ", Email: " + email);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
