package com.heg.threads;

class NewThread implements Runnable {
	Thread t;

	public NewThread() {
		// Create a new , second thread
		t = new Thread(this, "Demo Thread");
		System.out.println("Child thread: " + t);
		t.start();
	}

	// This is the entry point for the second thread

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread : " + i);
				Thread.sleep(500);
			}

		} catch (InterruptedException e) {
			System.out.println("Child Interrupted ");
		}
		System.out.println("Exiting child thread ..");
	}

}

public class ThreadDemo02 {
	
	public static void main(String[] args) {
		new NewThread(); //create a new thread 
		
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Main Thread " + i);
				Thread.sleep(1000);
			}
			
		}catch (InterruptedException e) {
			System.out.println("Main thread Interrupted .");		
		}System.out.println("Main Thread exiting");
	}

}
