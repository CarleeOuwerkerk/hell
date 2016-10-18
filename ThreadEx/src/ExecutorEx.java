import java.util.Random;
import java.util.concurrent.*;



public class ExecutorEx {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        //anonymous call of Callable
        Future<Integer> future = executor.submit(new Callable<Integer>() {

            @Override
            //return value is Integer
            public Integer call() throws TimeoutException {
                int count = 0;
                for (int i = 0; i < 10000; i++) {
                    count++;
                }

                return count;
            }
            });


        executor.shutdown();

        try {
            //get returned value from call()
            System.out.println("Result is: " + future.get());

        } catch (InterruptedException ignored) {
        } catch (ExecutionException e) {
            TimeoutException ex = (TimeoutException) e.getCause();
            System.out.println(ex.getMessage());
        }
    }

}