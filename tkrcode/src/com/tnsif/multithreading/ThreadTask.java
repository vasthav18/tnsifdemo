package com.tnsif.multithreading;

public class ThreadTask extends Thread {
	public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);

            // Yield control to other threads
            if (i == 3) {
                System.out.println(Thread.currentThread().getName() + " is yielding...");
                Thread.yield();
            }

            try {
                Thread.sleep(500); // Just to slow down for readability
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
