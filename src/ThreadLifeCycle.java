class SubThread extends Thread{
    public void run(){
        System.out.println("child thread started.");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread did its task");
    }
}

public class ThreadLifeCycle {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread start and create new child thread");
        Thread child = new SubThread();

        System.out.println("Main thread start child thread");
        child.start();

        System.out.println("Main thread continue to its task");
        Thread.sleep(500);

        System.out.println("Main thread wait for child thread");
        child.join();

        System.out.println("Main and child thread are both done");
    }
}
