/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.heg.test;

import com.heg.component.IECommerceStore;
import com.heg.factory.ECommerceStoreFactory;

/**
 *
 * @author softwaredeveloper
 */
public class Customer3 {
    
    public static void main(String[] args) {
        IECommerceStore store=null;
        store=ECommerceStoreFactory.getInstance("AM10");
        System.out.println(store.getClass());
        System.out.println("Bill Amount :: " +store.shopping(new String[]{"RAKHI","SWEETS"},new double[]{4000,3000}));
        
    }
    
}
