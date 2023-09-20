package com.tns.multithreading;

public class ThreadPriotrityExample extends Thread {
	
	public void run() {
		System.out.println("Inside the run() method ");
	}

	public static void main(String[] args) {

		ThreadPriotrityExample th1 = new ThreadPriotrityExample();
		ThreadPriotrityExample th2 = new ThreadPriotrityExample();
		ThreadPriotrityExample th3 = new ThreadPriotrityExample();
		
		System.out.println("Priority of thread th1 is :"+th1.getPriority());
		System.out.println("Priority of thread th2 is :"+th2.getPriority());
		System.out.println("Priority of thread th2 is :"+th3.getPriority());
		
		th1.setPriority(MAX_PRIORITY);
		th2.setPriority(NORM_PRIORITY);
		th3.setPriority(MIN_PRIORITY);
		
		System.out.println("Priority of thread th2 is :"+th1.getPriority());
		System.out.println("Priority of thread th2 is :"+th2.getPriority());
		System.out.println("Priority of thread th2 is :"+th3.getPriority());


	}

}
