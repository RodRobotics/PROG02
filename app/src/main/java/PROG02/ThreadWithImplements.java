package PROG02;

import static java.lang.Math.random;

public class ThreadWithImplements implements Runnable  {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("START: " + name);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + name);
                Thread.sleep((int)(random()*1000));
            }
        } catch (InterruptedException e) {
            System.err.println("Interrupted");
        }
        System.out.println("DONE: " + name);
    }
}