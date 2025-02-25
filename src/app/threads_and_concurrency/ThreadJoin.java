package app.threads_and_concurrency;

public class ThreadJoin extends Thread{
    public void run() {
        System.out.println("Thread is running...");
        try {
            Thread.sleep(2000); // Simulating some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread finished!");
    }
}
