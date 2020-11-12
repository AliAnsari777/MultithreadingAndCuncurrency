
class vegetable extends Thread{
    public int vegetable = 0;
    public static boolean chopping = true;

    public vegetable(String name){
        this.setName(name);
    }

    public void run(){
        while (chopping){
            System.out.println(this.getName() + " chopped a vegetable");
            vegetable++;
        }
    }
}

public class two {
    public static void main(String[] args) throws InterruptedException {
        vegetable ali = new vegetable("ali");
        vegetable karim = new vegetable("karim");

        ali.start();
        karim.start();

        Thread.sleep(1000);
        vegetable.chopping = false;

        ali.join();
        karim.join();
        System.out.println("ali chopped: " + ali.vegetable);
        System.out.println("Karim chopped:" + karim.vegetable);
    }
}
