import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorRun {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int user_input = input.nextInt();

        switch (user_input) {
            case 1:
                ExecutorService executor = Executors.newFixedThreadPool(5);
                for (int i = 0; i < 10; i++) {
                    Runnable worker = new WorkerThread();
                    executor.execute(worker);
                }
                executor.shutdown();
                while (!executor.isTerminated()) {
                }
                System.out.println("Finished all threads");

            case 2:
                ExecutorService executor2 = Executors.newFixedThreadPool(5);
                for (int i = 0; i < 10; i++) {
                    Runnable worker = new WorkerThread2();
                    executor2.execute(worker);
                }
                executor2.shutdown();
                while (!executor2.isTerminated()) {
                }
                System.out.println("Finished all threads");

        }



    }



}




class WorkerThread implements Runnable {

    Integer count = 0;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            count++;
            System.out.println(Thread.currentThread() + " " + count);
        }
}
}

class WorkerThread2 implements Runnable {

    Integer count = 0;
    @Override
    public void run() {




    }
}
