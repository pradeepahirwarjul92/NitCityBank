/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heg.entity;

/**
 *
 * @author softwaredeveloper
 */
public class Product {

    private Long pid;
    private String pName;
    private Float price;
    private Float qty;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getQty() {
        return qty;
    }

    public void setQty(Float qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Product{" + "pid=" + pid + ", pName=" + pName + ", price=" + price + ", qty=" + qty + '}';
    }

    
    
    
}
