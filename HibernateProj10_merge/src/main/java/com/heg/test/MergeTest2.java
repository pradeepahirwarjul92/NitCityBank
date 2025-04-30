/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heg.test;

import com.heg.entity.Membership;
import com.heg.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author softwaredeveloper
 */
public class MergeTest2 {

	public static void main(String[] args) {
		Session ses = null;
		boolean flag=false;
		Transaction tx=null;
		ses = HibernateUtil.getSession();		

		// Prepare object
		Membership member = null, member1 = null;

		// Load object
		member = (Membership) ses.get(Membership.class, 3L);
		System.out.println(member);
		System.out.println("------------------------------");

		try {
			tx=ses.beginTransaction();

			member1=new Membership();
			member1.setMid(3L);
			member1.setName("SURESH - 1");
			member1.setAddrs("HYDERABAD");
			member1.setRewardPoints(45);
			//ses.update(member1);
			//ses.save(member1);
			ses.merge(member1);
			flag=true;

		}catch(Exception ex) {
			flag=false;
			ex.printStackTrace();

		}finally {
			if(flag) {
				tx.commit();
			}else {
				tx.rollback();
			}
		}

	}

}
