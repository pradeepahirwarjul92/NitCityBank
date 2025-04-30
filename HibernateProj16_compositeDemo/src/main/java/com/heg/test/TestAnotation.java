package com.heg.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.heg.model.ProjectId;
import com.heg.model.ProjectInfo;
import com.heg.util.HibernateUtil;

public class TestAnotation {

	public static void main(String[] args) {
		System.out.println("TestAnotation.main()");

		ProjectId projectId = new ProjectId(1, 100);
		ProjectInfo info = new ProjectInfo(projectId, "PRADEEP", "IT", "TAWA VEHICLE");

		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ProjectId id = (ProjectId) ses.save(info);
		tx.commit();

		System.out.println("RECORDS SAVED RESPECTIVLY :: " + id);
	}

}
