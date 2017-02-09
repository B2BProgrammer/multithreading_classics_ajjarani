package io.ajjarani.multithreading;

public class Demo3 {
    public static void main(String[] args) {
	final Thread main_thread = Thread.currentThread (); 
	Thread child_thread = new Thread () {
	        public void run () {
		    while(true) {
			System.out.println("Child thread is executing ...");
			if (main_thread.isAlive()) {
			    System.out.println("Main thread is still alive!");
			}
			else {
			    System.out.println("Main thread is already dead!");
			}
		    }
		}
	    };
	child_thread.setDaemon(true);
        child_thread.start ();

	System.out.println("Main thread is about to end.");
    } // main()
} // Demo3

