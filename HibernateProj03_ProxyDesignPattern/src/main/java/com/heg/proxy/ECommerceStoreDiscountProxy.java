/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heg.proxy;

import com.heg.component.AmazonStore;
import com.heg.component.IECommerceStore;

/**
 *
 * @author softwaredeveloper
 */
public class ECommerceStoreDiscountProxy implements IECommerceStore {

    private IECommerceStore real;
    private float discount;

    public ECommerceStoreDiscountProxy(float discount) {

        this.discount = discount;
        real = new AmazonStore();
    }

    @Override
    public double shopping(String[] items, double[] prices) {

        double billAmt = 0.0f;
        double finalAmount = 0.0f;
        billAmt = real.shopping(items, prices);
        //give the discount
        finalAmount = billAmt - (billAmt * discount / 100);

        return finalAmount;
    }

}
