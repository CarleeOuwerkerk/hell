package Example;
class ThrdExample implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getId() +" number " + i);
        }

    }
}

public class Example {
    public static void main(String args[]) {

        for(int i = 1; i < 5; i++){
            Thread ThrdExample = new Thread (new ThrdExample());
            ThrdExample.start();
            Thread ThrdExample1 = new Thread (new ThrdExample());
            ThrdExample1.start();
        }
    }
}