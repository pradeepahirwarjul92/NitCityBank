package com.heg;

interface IFunctionInterface {
	
	//An abstract function
	void abstractFun(int x);
	
	//non abstract method or defualt method
	
	default void normalFun() {
		System.out.println("IFunctionInterface.normalFun()");
	}
	

}


public class LambdaExample01  {
	
	public static void main(String[] args) {
		
		//provide the implementation of abstract method 
		
		IFunctionInterface iObj=(x)->System.out.println("OUTPUT IS "+2*x);
		
		// thid calls above lambda expression and print out put 
		
		iObj.abstractFun(5);
		
		
		
		
	}

}
