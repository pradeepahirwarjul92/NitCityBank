package com.heg.threads;

//create multiple threads
class NewThread1 implements Runnable {
	String name; // name of thread
	Thread t;

	public NewThread1(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start(); // Start the thread
	}

	// This is entry point of thread
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + " : " + i);
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			System.out.println(name + "Interrupted");

		}
		System.out.println(name + "exiting . ");
	}
}

public class CreateMultipleThread {

	public static void main(String[] args) {
		new NewThread1("FirstThread"); // start thread
		new NewThread1("TwoThread");
		new NewThread1("ThirdThread");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Main thread Interruped");
		}
		System.out.println("Main thread exiting. ");
	}
}
