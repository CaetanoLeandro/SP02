package br.com.apresentacoes.sprint01.threads.deadlock;

public class TestThread {
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String args[]) {
        ThreadDemo1 T1 = new ThreadDemo1();
        ThreadDemo2 T2 = new ThreadDemo2();
        T1.start();
        T2.start();
    }

    private static class ThreadDemo1 extends Thread {
        public void run() {
            synchronized (Lock1) {
                System.out.println("Thread 1: Holding lock 1...");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
               System.out.println("Thread 1: Waiting for lock 2...");

                synchronized (Lock2) {
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
        }
    }

    private static class ThreadDemo2 extends Thread {
        public void run() {
            synchronized (Lock2) {
                System.out.println("Thread 2: Holding lock 2...");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread 2: Waiting for lock 1...");

                synchronized (Lock1) {
                    System.out.println("Thread 2: Holding lock 1 & 2...");
                }
            }
        }
    }
}
/*
        Thread1 is trying to access Thread2 and Thread2 is trying to access Thread1 -- this is deadlock.
        --------------------------------------------------------------
        Resolution = invert the <lock1> and <lock2> places of the <ThreadDemo2> class.
        --------------------------------------------------------------
        Ways to avoid deadlock - <notify()> and <wait()> methods.
        --------------------------------------------------------------
 */