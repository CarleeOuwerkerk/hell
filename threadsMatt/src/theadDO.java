import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by foxma on 11/8/2016.
 */
public class theadDO {
    private int count =0;

    private void incress(){
        for (int i=0; i<100000; i++){
            count++;
        }
    }

    private void decress(){
        for (int i=0; i<100000; i++){
            count--;
        }
    }
    public void fistTh() throws InterruptedException{
        incress();
    }
    public void seconTh() throws InterruptedException{
        decress();
    }
    public void print(){System.out.println("coutn is: " +count);
    }
}


 class theadS {
    private int count =0;

    private void incress(){
        for (int i=0; i<100000; i++){
            count++;
        }
    }

    private void decress(){
        for (int i=0; i<100000; i++){
            count--;
        }
    }
    public synchronized void fistTh() throws InterruptedException{
        incress();
    }
    public synchronized void seconTh() throws InterruptedException{
        decress();
    }
    public void print(){System.out.println("coutn is: " +count);
    }
}

class theadPass {
    private int count =0;
    private Lock bossMatt = new ReentrantLock();


    private void incress(){
        for (int i=0; i<100000; i++){
            count++;
        }
    }

    private void decress(){
        for (int i=0; i<100000; i++){
            count--;
        }
    }
    public void fistTh() throws InterruptedException{
        bossMatt.lock();
        incress();
        bossMatt.unlock();
    }
    public void seconTh() throws InterruptedException{
        bossMatt.lock();
        decress();
        bossMatt.unlock();
    }
    public void print(){System.out.println("coutn is: " +count);
    }
}


class theadPassTwo {
    private int count =0;
    private Lock bossMatt = new ReentrantLock();
    private Lock bossMattTwo = new ReentrantLock();


    private void incress(){
        for (int i=0; i<100000; i++){
            count++;
        }
    }

    private void decress(){
        for (int i=0; i<100000; i++){
            count--;
        }
    }
    public void fistTh() throws InterruptedException{
        bossMattTwo.lock();
        incress();
        bossMatt.unlock();
    }
    public  void seconTh() throws InterruptedException {
        try {
            bossMatt.lock();
            decress();
            bossMatt.unlock();
        } catch (IllegalMonitorStateException pass) {
            pass.printStackTrace();

        }
    }

    public void print(){System.out.println("coutn is: " +count);
    }
}