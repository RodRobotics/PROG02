package PROG02;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class WithExecutorFramework {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Runnable runnable = new ThreadWithImplements();
        Thread thread = new Thread(runnable,"Hallo");
        ThreadWithExtends threadWithExtends = new ThreadWithExtends("Kerosene");
        executor.execute(thread);
        executor.execute(threadWithExtends);
    }
}
