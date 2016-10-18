import java.util.Scanner;

/**
 * Created by samwa on 10/12/2016.
 *
 * /
 *
 * */



public class ThreadEx {

    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int user_input = input.nextInt();

        switch (user_input) {
            case 1:

                final Racer Worker = new Racer();

                Thread t1 = new Thread(new Runnable() {
                    public void run() {
                        try {
                            Worker.firstThread();
                        } catch (InterruptedException ignored) {
                        }
                    }
                });

                Thread t2 = new Thread(new Runnable() {
                    public void run() {
                        try {
                            Worker.secondThread();
                        } catch (InterruptedException ignored) {
                        }
                    }
                });

                t1.start();
                t2.start();
                t1.join();
                t2.join();
                Worker.print();

                break;

            case 2:
                final syncEx syncEx = new syncEx();

                Thread th1 = new Thread(new Runnable() {
                    public void run() {
                        try {
                            syncEx.firstThread();
                        } catch (InterruptedException ignored) {
                        }
                    }
                });

                Thread th2 = new Thread(new Runnable() {
                    public void run() {
                        try {
                            syncEx.secondThread();
                        } catch (InterruptedException ignored) {
                        }
                    }
                });

                th1.start();
                th2.start();
                th1.join();
                th2.join();
                syncEx.print();

                break;

            case 3:
                final lockEx worker = new lockEx();

                Thread thOne = new Thread(new Runnable() {
                    public void run() {
                        try {
                            worker.firstThread();
                        } catch (InterruptedException ignored) {
                        }
                    }
                });

                Thread thTwo = new Thread(new Runnable() {
                    public void run() {
                        try {
                            worker.secondThread();
                        } catch (InterruptedException ignored) {
                        }
                    }
                });

                thOne.start();
                thTwo.start();
                thOne.join();
                thTwo.join();
                worker.print();

                break;

            case 4:
                final lockExError slave = new lockExError();

                Thread threadOne = new Thread(new Runnable() {
                    public void run() {
                        try {
                            slave.firstThread();
                        } catch (InterruptedException ignored) {
                        }
                    }
                });

                Thread threadTwo = new Thread(new Runnable() {
                    public void run() {
                        try {
                            slave.secondThread();
                        } catch (InterruptedException ignored) {
                        }
                    }
                });

                threadOne.start();
                threadTwo.start();
                threadOne.join();
                threadTwo.join();
                slave.print();

                break;

        }


    }
}