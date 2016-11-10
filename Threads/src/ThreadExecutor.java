import java.util.Scanner;

public class ThreadExecutor {


    //NASTY PATH

    //race condition
    public static void main(String[] args) throws Exception {


        final ThreadActions threadActions = new ThreadActions();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    threadActions.runFirstThread();
                } catch (InterruptedException ignored) {
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    threadActions.runSecondThread();
                } catch (InterruptedException ignored) {
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        threadActions.print();



        //HAPPY PATH

        //everything is synchronized
        final SyncExample threadActionsTwo = new SyncExample();

        Thread threadOne = new Thread(new Runnable() {
            public void run() {
                try {
                    threadActions.runFirstThread();
                } catch (InterruptedException ignored) {
                }
            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            public void run() {
                try {
                    threadActions.runSecondThread();
                } catch (InterruptedException ignored) {
                }
            }
        });

        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();
        threadActionsTwo.print();




        //HAPPY PATH

        //lock happy path
        final LockExample threadActionsThree = new LockExample();

        Thread th1 = new Thread(new Runnable() {
            public void run() {
                try {
                    threadActions.runFirstThread();
                } catch (InterruptedException ignored) {
                }
            }
        });

        Thread th2 = new Thread(new Runnable() {
            public void run() {
                try {
                    threadActions.runSecondThread();
                } catch (InterruptedException ignored) {
                }
            }
        });

        th1.start();
        th2.start();
        th1.join();
        th2.join();
        threadActionsThree.print();




        //NASTY PATH

        //lock happy path
        final BadLockExample threadActionsFour = new BadLockExample();

        Thread thr1 = new Thread(new Runnable() {
            public void run() {
                try {
                    threadActionsFour.runFirstThread();
                } catch (InterruptedException ignored) {
                }
            }
        });

        Thread thr2 = new Thread(new Runnable() {
            public void run() {
                try {
                    threadActionsFour.runSecondThread();
                } catch (InterruptedException ignored) {
                }
            }
        });

        thr1.start();
        thr2.start();
        thr1.join();
        thr2.join();
        threadActionsFour.print();

    }}