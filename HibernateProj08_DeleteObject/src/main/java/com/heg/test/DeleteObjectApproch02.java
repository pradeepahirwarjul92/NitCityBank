/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heg.test;

import com.heg.entity.Product;
import com.heg.utils.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author softwaredeveloper
 */
public class DeleteObjectApproch02 {

    public static void main(String[] args) {
        Session ses = null;
        ses = HibernateUtil.getSession();
        Transaction tx = null;
        boolean flag = false;
        Product p = null;
        try {
            tx = ses.beginTransaction();
            p = (Product) ses.get(Product.class, 3l);
            System.out.println(p);
            if (p != null) {
                ses.delete(p);
                flag = true;
            } else {
                System.out.println("RECORDS NOT FOUND");
                flag = false;
            }

        } catch (HibernateException he) {
            he.printStackTrace();
            flag = false;
        } finally {
            if (flag) {
                tx.commit();
                System.out.println("Object deleted ");
            } else {
                tx.rollback();
                System.out.println("Object Not deleted");

            }
            ses.close();

        }

    }

}
