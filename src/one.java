
// simple thread that waste cpu for ever
class wasteCPU extends Thread{
    public void run(){
        while (true){}
    }
}

public class one{
    public static void main(String[] args) {
        //display current information about this process
        Runtime runtime = Runtime.getRuntime();

        long usedKB = (runtime.totalMemory() - runtime.freeMemory()) / 1024;
        System.out.println("Process ID: " + ProcessHandle.current().pid());
        System.out.println("Thread count: " + Thread.activeCount());
        System.out.println("Memory Usage: " + usedKB);

        System.out.println("\nStarting 6 waste CPU threads\n");
        for (int i = 0; i < 4 ; i++) {
            new wasteCPU().start();
        }

        usedKB = (runtime.totalMemory() - runtime.freeMemory()) / 1024;
        System.out.println("Process ID: "  + ProcessHandle.current().pid());
        System.out.println("Thread count: " + Thread.activeCount());
        System.out.println("Memory Usage: " + usedKB);
    }
}
