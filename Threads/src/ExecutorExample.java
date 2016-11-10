import java.util.concurrent.*;


//Executor service
/**
 * Created by Carlee on 2016-11-08.
 */
public class ExecutorExample {

    public static void main(String[] args) {

        try{
            ExecutorService executor = Executors.newFixedThreadPool(1);

            //pass return value of Callable
            Future<Integer> future = executor.submit(new Callable<Integer>() {

                @Override
                public Integer call() throws TimeoutException {
                    Integer count = 0;
                    for (Integer i = 0; i < 1000; i++) {

                        count++;
                    }
                    return count;
                }
            });

            executor.shutdown();

            try {
                // get count value
                System.out.println("Result is " + future.get());

            } catch (InterruptedException ignored) {
            } catch (ExecutionException e) {
                TimeoutException ex = (TimeoutException) e.getCause();
                System.out.println(ex.getMessage());
            }
        }catch(IllegalArgumentException Zerostrings){
            Zerostrings.printStackTrace();
        }



        //NASTY PATH

        //0 threads to manage in threadpool
        try{
            ExecutorService executor = Executors.newFixedThreadPool(0);

            //callable to executor
            Future<Integer> future = executor.submit(new Callable<Integer>() {

                @Override
                public Integer call() throws TimeoutException {
                    Integer count = 0;
                    for (Integer i = 0; i < 1000; i++) {

                        count++;
                    }
                    return count;
                }
            });

            executor.shutdown();

            try {
                System.out.println("Result is " + future.get());

            } catch (InterruptedException ignored) {
            } catch (ExecutionException e) {
                TimeoutException ex = (TimeoutException) e.getCause();
                System.out.println(ex.getMessage());
            }
        }catch(IllegalArgumentException Zerostrings){
            Zerostrings.printStackTrace();
        }}}