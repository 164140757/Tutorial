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
            // number is used to count down
            for(int i = 5; i>0;i++){
                System.out.println("Child Thread: "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Existing Child thread.");
    }

    public static void main(String[] args) {
        SimpleThread st = new SimpleThread();
        // start child thread, run() will be called
        st.t.start();
        try {
            for(int i = 5; i>0;i++){
                System.out.println("Main Thread: "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Existing Main thread.");
    }
}
