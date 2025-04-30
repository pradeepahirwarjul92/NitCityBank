/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heg.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author softwaredeveloper
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        // Create SessionFactory from hibernate.cfg.xml
        sessionFactory = new Configuration().configure("com/heg/cnfg/hibernate.cfg.xml").buildSessionFactory();
    }

    public static Session getSession() {
        if (sessionFactory != null) {
            return sessionFactory.openSession();
        } else {
            return null;
        }

    }

    public static void shutdown() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }

    }
}
