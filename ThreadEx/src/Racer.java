import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by samwa on 10/12/2016.
 */
public class Racer {

    private int count = 0;

    private void increase() {
        for(int i=0; i<10000; i++){
            count++;
        }
    }

    private void decrease(){
        for(int i=0; i<10000; i++){
            count--;
        }
    }

    public void firstThread() throws InterruptedException {

        increase();
    }

    public void secondThread() throws InterruptedException {

        decrease();
    }

    public void print(){
        System.out.println("Count is: " + count);
    }

}

class syncEx {

    private int count = 0;

    private void increase() {
        for(int i=0; i<10000; i++){
            count++;
        }
    }

    private void decrease() {
        for(int i=0; i<10000; i++){
            count--;
        }
    }

    public synchronized void firstThread() throws InterruptedException {

        increase();
    }

    public synchronized void secondThread() throws InterruptedException {

        decrease();
    }

    public void print(){
        System.out.println("Count is: " + count);
    }

}

class lockEx {

    private int count = 1;
    private Lock hallPass = new ReentrantLock();
    private void increase() {
        for(int i=0; i<10000; i++){
            count++;
        }
    }

    private void decrease() {
        for(int i=0; i<10000; i++){
            count--;
        }
    }

    public void firstThread() throws InterruptedException {
        hallPass.lock();
        increase();
        hallPass.unlock();
    }

    public void secondThread() throws InterruptedException {
        hallPass.lock();
        decrease();
        hallPass.unlock();
    }

    public void print(){
        System.out.println("Count is: " + count);
    }


}

class lockExError {

    private int count = 1;
    private Lock hallPass = new ReentrantLock();
    private Lock hallPassTwo = new ReentrantLock();
    private void increase() {
        for(int i=0; i<10000; i++){
            count++;
        }
    }

    private void decrease() {
        for(int i=0; i<10000; i++){
            count--;
        }
    }

    public void firstThread() throws InterruptedException {
        hallPassTwo.lock();
        increase();

        hallPass.unlock();
    }

    public void secondThread() throws InterruptedException {
        hallPass.lock();
        decrease();
        hallPassTwo.unlock();
    }

    public void print() {
            hallPass.lock();
            hallPassTwo.lock();


            System.out.println("Count is: " + count);

            hallPass.unlock();
            hallPassTwo.unlock();


    }
}

