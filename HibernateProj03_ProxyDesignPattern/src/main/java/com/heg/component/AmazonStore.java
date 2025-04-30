/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heg.component;

import java.util.stream.DoubleStream;

/**
 *
 * @author softwaredeveloper
 */
public class AmazonStore implements IECommerceStore {

    
    @Override
    public double shopping(String[] items, double[] prices) {
        double billAmt = 0.0;
        billAmt = DoubleStream.of(prices).sum();
        return billAmt;
    }

}
