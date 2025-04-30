package com.heg.test;

import org.hibernate.Session;

import com.heg.entity.Product;
import com.heg.utils.HibernateUtil;

public class SaveObjectTest {
public static void main(String[] args) {
        
        //CREATE PRODUCT OBJECT
        
        Product prod=new Product();
        prod.setPid(10);
        prod.setPname("CHAIR");
        prod.setPrice(154.5f);
        prod.setQty(10f);
        
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
