/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heg.test;

import com.heg.entity.Membership;
import com.heg.utils.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author softwaredeveloper
 */
public class MergeTest {

    public static void main(String[] args) {
        Session ses = null;
        ses = HibernateUtil.getSession();
        Transaction tx = null;
        boolean flag = false;
        //Prepare object 
        Membership member = new Membership();
        member.setMid(4l);
        member.setName("PRAMOD AHIRWAR");
        member.setAddrs("Hyderbad");
        member.setRewardPoints(5);

        try {
            //begin Transaction             
            tx = ses.beginTransaction();
          Membership m=  (Membership) ses.merge(member);
            System.out.println("====== OBJECT========== " +m);
            flag = true;

        } catch (HibernateException he) {
            he.printStackTrace();
            flag = false;
        } finally {
            if (flag) {
                tx.commit();
                System.out.println("OBJECT ADDED SUCCESSFULLY ");
            } else {
                tx.rollback();
                System.out.println("OBJECT NOT ADDED");

            }
            HibernateUtil.closeSession(ses);
            HibernateUtil.closeSessionFactory();

        }

    }

}
