/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heg.test;

import com.heg.entity.BankAccount;
import com.heg.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author softwaredeveloper
 */
public class Approch1UpdateObjectTest {

    public static void main(String[] args) {

        Session ses = null;
        BankAccount account = null;
        ses = HibernateUtil.getSession();
        Transaction tx = null;
        boolean flag = false;

        account = new BankAccount();
        account.setAcno(6545);
        account.setHolderName("Rakesh");
        account.setBalance(20111110.644);

        try {
            tx = ses.beginTransaction();
            ses.update(account);
            flag = true;

        } catch (Exception e) {
            System.out.println("Object not found ");
            flag = false;
            e.printStackTrace();
        } finally { 
            if (flag) {
                tx.commit();
                System.out.println("Object Updated");

            } else {
                tx.rollback();
                System.out.println("Object not updated");

            }
            ses.close();
            HibernateUtil.shutdown();

        }

    }

}
