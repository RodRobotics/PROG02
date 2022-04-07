package PROG02;
import static java.lang.Math.random;

public class ThreadWithExtends extends Thread{

    public ThreadWithExtends(){}
    public ThreadWithExtends(String name){super(name);}


    public  void run(){
        System.out.println("START: " + getName());
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + getName());
                Thread.sleep((int)(random()*1000));
            }
        } catch (InterruptedException e) {
            System.err.println("Interrupted");
        }
        System.out.println("DONE: " + getName());
    }
    }



