package com.heg.threads;

public class CurrentThreadDemo {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("Current Thread :: " +t);
		
		//chnage the name of the thread
		
		t.setName("MyThread ");
		
		System.out.println("After name change :: " +t);
		
		try {
			for(int n=5;n>0;n--) {
				System.out.println(n);
				Thread.sleep(1000);
			}
			
		}catch (Exception e) {
			System.out.println("Main thread interrupted");
		}
	}
}
