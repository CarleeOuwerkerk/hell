/**
 * Created by foxma on 11/8/2016.
 */
public class threads {
    public static void main(String[] args) throws Exception{


        final theadDO Worker = new theadDO();
// dose not work
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    Worker.fistTh();
                } catch (InterruptedException ignored) {
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    Worker.seconTh();
                } catch (InterruptedException ignored) {
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        Worker.print();


        //this bring it together

        final theadS Workers = new theadS();

        Thread ts1 = new Thread(new Runnable() {
            public void run() {
                try {
                    Workers.fistTh();
                } catch (InterruptedException ignored) {
                }
            }
        });
        Thread ts2 = new Thread(new Runnable() {
            public void run() {
                try {
                    Workers.seconTh();
                } catch (InterruptedException ignored) {
                }
            }
        });

        ts1.start();
        ts2.start();
        ts1.join();
        ts2.join();
        Workers.print();


        final theadPass WorkerPass = new theadPass();

        Thread tPass1 = new Thread(new Runnable() {
            public void run() {
                try {
                    WorkerPass.fistTh();
                } catch (InterruptedException ignored) {
                }
            }
        });
        Thread tPass2 = new Thread(new Runnable() {
            public void run() {
                try {
                    WorkerPass.seconTh();
                } catch (InterruptedException ignored) {
                }
            }
        });

        tPass1.start();
        tPass2.start();
        tPass1.join();
        tPass2.join();
        WorkerPass.print();



        final theadPassTwo WorkerPassTwo = new theadPassTwo();

        Thread tPassTwo1 = new Thread(new Runnable() {
            public void run() {
                try {
                    WorkerPassTwo.fistTh();
                } catch (InterruptedException ignored) {
                }
            }
        });
        Thread tPassTwo2 = new Thread(new Runnable() {
            public void run() {
                try {
                    WorkerPassTwo.seconTh();
                } catch (InterruptedException ignored) {
                }
            }
        });

        tPassTwo1.start();
        tPassTwo2.start();
        tPassTwo1.join();
        tPassTwo2.join();
        WorkerPassTwo.print();

    }

}

