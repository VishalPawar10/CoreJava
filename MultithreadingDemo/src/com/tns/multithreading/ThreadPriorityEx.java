package com.tns.multithreading;

public class ThreadPriorityEx extends Thread{

	public void run() {
		System.out.println("Inside run() method ");
	}
	public static void main(String[] args) {

		Thread.currentThread().setPriority(9);
		System.out.println("Priority of main thread is : "+ Thread.currentThread().getPriority());
		
		ThreadPriorityEx th1 = new ThreadPriorityEx();
		System.out.println("The current thread is :"+th1.getPriority());
		
		
	}

}
