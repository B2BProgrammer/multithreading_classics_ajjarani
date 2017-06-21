package io.ajjarani.multithreading;

class SimpleThread extends Thread {
   public SimpleThread(int ID) {myID = ID;}
   public void run() {System.out.println("Thread " + myID + " is running.");}
   private int myID;
   
   // Testing
}

public class Demo1 {
    public static void main(String[] args) {
	SimpleThread thread1 = new SimpleThread(1);
	SimpleThread thread2 = new SimpleThread(2);
	// causes method run() to execute
	thread1.start();
	// causes method run() to execute
	thread2.start(); 				
    }
}
