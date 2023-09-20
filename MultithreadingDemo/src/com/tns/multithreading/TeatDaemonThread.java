package com.tns.multithreading;

public class TeatDaemonThread extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon is working");
		}else {
			System.out.println("user is working");

		}
}

	public static void main(String[] args) {

		TeatDaemonThread th1 = new TeatDaemonThread();
		TeatDaemonThread th2 = new TeatDaemonThread();
		TeatDaemonThread th3 = new TeatDaemonThread();
		
		th2.setDaemon(true);
		th1.start();
		th3.start();
		th2.start();
	}

}
