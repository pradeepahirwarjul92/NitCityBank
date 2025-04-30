package com.heg;

@FunctionalInterface
interface ZeroParameter{
	void display();
}

public class LambdaZeroParameter {
	
	public static void main(String[] args) {
		//Lambda  expression with zero parameter 
		
		ZeroParameter zeroParam=()->System.out.println("Zero paramater lambda expression !");
		
		
		//Invoke the method 
		
		zeroParam.display();
	}

}
