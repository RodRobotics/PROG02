package PROG02;

import java.util.concurrent.*;

public class CallableExecutorService {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("Entered Callable");
                TimeUnit.SECONDS.sleep(5); // Perform some computation
                return "Hello from Callable";
            }
        };
        System.out.println("Submitting Callable");
        Future<String> future = executorService.submit(callable);
        // This line executes immediately
        System.out.println("Do something else while callable is executed");
        TimeUnit.MILLISECONDS.sleep(200);
        System.out.println("Retrieve the result of the future");

        String result = future.get();
        System.out.println("Result: " + result);
        executorService.shutdown();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

    }
}
