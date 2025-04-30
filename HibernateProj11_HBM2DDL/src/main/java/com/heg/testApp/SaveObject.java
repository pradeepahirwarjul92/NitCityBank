/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.heg.testApp;

import com.heg.entity.Product;
import com.heg.utils.HibernateUtil;
import org.hibernate.Session;


/**
 *
 * @author softwaredeveloper
 */
public class SaveObject {
    
    public static void main(String[] args) {
        
        //CREATE PRODUCT OBJECT
        
        Product prod=new Product();
      
        prod.setpName("CHAIR");
        prod.setPrice(154.50f);
        prod.setQty(10.00f);
        
        Session session=HibernateUtil.getSession();
        try{
            //start transaction
            session.beginTransaction();
            session.save(prod);
            session.getTransaction().commit();
            
            System.out.println("Product saved successfully with ID :: " +prod.getPid());
            
        }finally{
            session.close();
            HibernateUtil.shutdown();
        }
        
    }
    
}
