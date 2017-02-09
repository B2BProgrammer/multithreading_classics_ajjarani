package io.ajjarani.multithreading;

class SimpleRunnable implements Runnable {
    public SimpleRunnable(int ID) {myID = ID;}
    public void run() { System.out.println("Thread " + myID + " is running.");	}
    private int myID;
}
public class Demo2 {
    public static void main(String[] args) {
	Runnable r = new SimpleRunnable(3);
	Thread thread3 = new Thread(r);
	thread3.start();
    }
}
