/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.heg.testApp;

/**
 *
 * @author softwaredeveloper
 */
public class WayToCreateObject {
    public static void main(String[] args) throws ClassNotFoundException {
       // Using Class.forName(-) method
        Class c=Class.forName("java.util.Date");
        System.out.println("=====C========" +c);
        
        //Using getClass() method of java.lang.Object
        
        String s=new String("Ok");
        Class  c1=s.getClass();
        
        System.out.println(" ============C ========" +c1); 
        
        //Using "Class" property
        
        Class c2=System.class;
        
        System.out.println(" =======C2=======" +c2);
    }
}
