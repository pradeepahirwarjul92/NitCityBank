/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heg.factory;

import com.heg.component.AmazonStore;
import com.heg.component.IECommerceStore;
import com.heg.proxy.ECommerceStoreDiscountProxy;

/**
 *
 * @author softwaredeveloper
 */
public class ECommerceStoreFactory {

    public static IECommerceStore getInstance(String cuponCode) {

        if (cuponCode.equalsIgnoreCase("") || cuponCode.trim().length() == 0) {
            return new AmazonStore();
        } else {
            if (cuponCode.equalsIgnoreCase("AM10")) {
                return new ECommerceStoreDiscountProxy(10);//proxy object
            } else if (cuponCode.equalsIgnoreCase("AM20")) {
                return new ECommerceStoreDiscountProxy(20);//proxy object
            } else {
                return new ECommerceStoreDiscountProxy(5); //proxy object
            }
        }

    }

}
