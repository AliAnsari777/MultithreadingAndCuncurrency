class Shopper extends Thread{
    static int counter = 0;
    public void run(){
        for (int i = 0; i < 100000; i++) {
            counter++;
        }
    }
}

public class DataRace {
    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Shopper();
        Thread threadTwo = new Shopper();

        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();

        System.out.println("value of counter is " + Shopper.counter);
    }
}
