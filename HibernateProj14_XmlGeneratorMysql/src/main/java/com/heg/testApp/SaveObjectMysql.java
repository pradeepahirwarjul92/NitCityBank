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
public class SaveObjectMysql {
    
	 public static void main(String[] args) {
	        
	        //CREATE PRODUCT OBJECT
	        
	        Product prod=new Product();
	      
	        Session session=HibernateUtil.getSession();
	        boolean flag=false;
	        try{
	            //start transaction
	            session.beginTransaction();
	            
	            for(int i=1;i<=20;i++) {
	            	 prod=new Product();       
	                 prod.setpName("CHAIR");
	                 prod.setPrice(154.5);
	                 prod.setQty(10);
	                 session.save(prod);
	               System.out.println("GENERATED ID VALUE IS  :: " +prod.getPid());
	               flag=true;
	            }

	            session.getTransaction().commit();
	            
	            
	            
	        }finally{
	            session.close();
	            HibernateUtil.shutdown();
	        }
	        
	    }
	    
    
}
