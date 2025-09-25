package com.tnsif.multithreading;

public class TaskMain {

	public static void main(String[] args) {
		ThreadTask t1 = new ThreadTask();
		ThreadTask t2 = new ThreadTask();
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		
		t1.start();
		
		try {
            // Main thread will wait until t1 finishes before starting t2
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();

        try {
            // Main thread waits for t2 also
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread ends after both threads complete.");
	}

}
