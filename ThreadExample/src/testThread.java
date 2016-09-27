/**
 * Created by samwa on 9/21/2016.
 */
////
class ThreadExample extends Thread {

    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getId() +" number " + i);
        }

    }


}

public class testThread {
    public static void main(String args[]) {

        for(int i = 1; i < 5; i++){
        ThreadExample threadexample = new ThreadExample();
        threadexample.start();
    }
}
}