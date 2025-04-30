/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.heg.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author softwaredeveloper
 */
public class HibernateUtil {
    private static SessionFactory factory;

    static {
        Configuration cfg = null;
        try {
            //Boostrap hibernate
            cfg = new Configuration();

            //input hibernate cfg file 
            cfg.configure("com/heg/cfgs/hibernate.cfg.xml");

            //create SessionFactory object
            factory = cfg.buildSessionFactory();

        } catch (HibernateException he) {
            he.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Session getSession() {
        if(factory!=null)
            return factory.openSession();
        else
            return null;
    }

   public static void closeSession(Session ses){
   
       if(ses!=null){
       ses.close();
       }
   }
   
   public static void closeSessionFactory(){
       if(factory!=null)
           factory.close();
   
   }
}
