package com.heg.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.heg.model.ParticipantsModel;
import com.heg.utils.HibernateUtil;

public class FetchUsingWhereClause {
	
	public static void main(String[] args) {
		Session session=HibernateUtil.getSession();
		
		
		try {
			
			Query query=session.createQuery("FROM ParticipantsModel WHERE  ASSESOR_TRAINER = :empcode ");
			query.setParameter("empcode", "113");
			List<ParticipantsModel> participants=query.list();
			
			participants.forEach(e->System.out.println(" ID :: " +e.getSch_id() + ", Training Title ::  "  +e.getTraining_title()));
			
			
			
			
		}catch (Exception e) {
		e.printStackTrace();
		}
		
	}

}
