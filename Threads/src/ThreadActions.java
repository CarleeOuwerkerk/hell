import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Carlee on 2016-11-08.
 */
public class ThreadActions {

    private Integer counter = 0;

    private void increaseAmount(){
        for(int i = 0; i < 1000; i++){
            counter++;
        }
    }

    private void decreaseAmount(){
        for(int i = 0; i < 1000; i++){
            counter--;
        }
    }

    public void runFirstThread() throws InterruptedException{

        increaseAmount();
    }

    public void runSecondThread() throws InterruptedException{

        decreaseAmount();
    }

    public void print() {
        System.out.println("Count is " + counter);
    }
}
class SyncExample {

    private Integer counter = 0;

    private void increaseAmount(){
        for(int i = 0; i < 1000; i++){
            counter++;
        }
    }

    private void decreaseAmount(){
        for(int i = 0; i < 1000; i++){
            counter--;
        }
    }

    public synchronized void runFirstThread() throws InterruptedException{

        increaseAmount();
    }

    public synchronized void runSecondThread() throws InterruptedException{

        decreaseAmount();
    }

    public void print() {
        System.out.println("Count is " + counter);
    }
}


class LockExample {

    private Integer counter = 0;
    private Lock token = new ReentrantLock();



    private void increaseAmount(){
        for(int i = 0; i < 1000; i++){
            counter++;
        }
    }

    private void decreaseAmount(){
        for(int i = 0; i < 1000; i++){
            counter--;
        }
    }

    public void runFirstThread() throws InterruptedException{
        token.lock();
        increaseAmount();
        token.unlock();
    }

    public void runSecondThread() throws InterruptedException{
        token.lock();
        decreaseAmount();
        token.unlock();
    }

    public void print() {
        System.out.println("Count is " + counter);
    }
}


class BadLockExample {

    private Integer counter = 0;
    private Lock token2 = new ReentrantLock();
    private Lock token = new ReentrantLock();


    private void increaseAmount(){
        for(int i = 0; i < 1000; i++){
            counter++;
        }
    }

    private void decreaseAmount(){
        for(int i = 0; i < 1000; i++){
            counter--;
        }
    }

    public void runFirstThread() throws InterruptedException{
        token2.lock();
        increaseAmount();
        token.unlock();
    }

    public void runSecondThread () throws InterruptedException {
        try{
            token.lock();
            decreaseAmount();
            token.unlock();
        }catch(IllegalMonitorStateException CrossLock){
            CrossLock.printStackTrace();
        }
    }

    public void print() {
        System.out.println("Count is " + counter);
    }
}