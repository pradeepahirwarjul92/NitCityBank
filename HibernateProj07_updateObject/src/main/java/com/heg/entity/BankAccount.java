/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.heg.entity;

import java.io.Serializable;

/**
 *
 * @author softwaredeveloper
 */
public class BankAccount implements Serializable{
    private long acno;
    private String holderName;
    private double balance;

    public BankAccount() {
        System.out.println("BankAccount");
    }
    
    

    public long getAcno() {
        return acno;
    }

    public void setAcno(long acno) {
        this.acno = acno;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "acno=" + acno + ", holderName=" + holderName + ", balance=" + balance + '}';
    }
    
    
    
}
