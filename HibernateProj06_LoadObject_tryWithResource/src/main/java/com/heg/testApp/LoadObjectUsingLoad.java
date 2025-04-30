/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heg.testApp;

import com.heg.entity.InsurancePolicy;
import com.heg.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author softwaredeveloper
 */
public class LoadObjectUsingLoad {

    public static void main(String[] args) {

        Session ses = null;
        InsurancePolicy policy = null;
        ses = HibernateUtil.getSession();

        try {
            //Load object by using load method
            policy = (InsurancePolicy) ses.load(InsurancePolicy.class, 1l);
            System.out.println(policy.getClass() + "  " + policy.getClass().getSuperclass());
            System.out.println(policy.getPolicyId());
            policy.getCompany();

            if (policy == null) {
                System.out.println("RECORD NOT FOUND");
            } else {
                System.out.println("RECORD FOUND AND DISPLAYED");
            }

          //  System.out.println(policy);
        } catch (HibernateException he) {
            he.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession(ses);
            HibernateUtil.closeSessionFactory();
        }

    }

}
