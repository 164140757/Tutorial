package MultiThreads;

public class SimpleThread implements Runnable {
    Thread t;
    SimpleThread(){
        //create a new Thread
        t = new Thread(this,"Demo Thread");
        System.out.println("child thread:"+t);
    }
    // entry point where the thread will enter when start() is called
    public void run() {
        try {
            for(int i = 5; i>0;i++){
                System.out.println("Child Thread: "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
