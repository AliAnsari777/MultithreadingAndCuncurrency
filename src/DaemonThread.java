
class childThread implements Runnable{
    public void run(){
        while (true){
            System.out.println("child thread is executing");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread child = new Thread(new childThread());
        child.setDaemon(true);
        child.start();

        System.out.println("Main thread is running");
        Thread.sleep(500);

        System.out.println("Main thread is running");
        Thread.sleep(500);

        System.out.println("Main thread is running");
        Thread.sleep(500);

        System.out.println("Main thread is done");
    }
}
