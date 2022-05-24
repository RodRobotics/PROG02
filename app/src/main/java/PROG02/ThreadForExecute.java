package PROG02;

public class ThreadForExecute implements Runnable{
    private final int id;
    private final long starttime;
    public ThreadForExecute(int id, long starttime) {
        this.id = id;
        this.starttime = starttime;
    }

        @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getId());
        System.out.println("Executing Task " + id +
                " at " + (System.currentTimeMillis()-starttime) + " ms after start " +
                " in Thread : " + Thread.currentThread().getName());
    }
}
