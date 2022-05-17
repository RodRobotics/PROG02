package PROG02;
import java.util.concurrent.*;

public class WithExecutorFramework {
    public static void main(String[] args) {
        //ExecutorService executor = Executors.newFixedThreadPool(1);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
        System.out.println("The time is"+System.currentTimeMillis());

        //scheduledExecutorService.schedule(new ThreadForExecute(2,System.currentTimeMillis()),10,TimeUnit.SECONDS);
       //scheduledExecutorService.scheduleAtFixedRate(new ThreadForExecute(3,System.currentTimeMillis()),5,10,TimeUnit.SECONDS);
       scheduledExecutorService.scheduleWithFixedDelay(new ThreadForExecute(3,System.currentTimeMillis()),2,5,TimeUnit.SECONDS);


        //executorService.execute(new ThreadWithImplements());

        //executorService.shutdown();
        //scheduledExecutorService.shutdown();
       // executorService.execute(runnable);


        //ThreadWithExtends threadWithExtends = new ThreadWithExtends("Kerosene");
        //executor.execute(thread);
        //executor.execute(threadWithExtends);
    }
}
