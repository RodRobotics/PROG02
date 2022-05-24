package PROG02;

import java.util.concurrent.TimeUnit;

public class Wait_Notify_1
{
    public static void main(String[] args)
    {
        Object ob = new Object();
        Waiter wt1 = new Waiter(ob);
        Waiter wt2 = new Waiter(ob);
        Waiter wt3 = new Waiter(ob);
        wt1.start();
        wt2.start();
        wt3.start();

        try { TimeUnit.SECONDS.sleep(1);
        } catch(InterruptedException ex) {}

        synchronized(ob)

        {
            System.out.println("main calls notify");
            ob.notify();

        }
        try { TimeUnit.SECONDS.sleep(2); } catch(InterruptedException ex) {}
        System.out.println("main interrupts all waiting threads");

       // wt1.interrupt();
       // wt2.interrupt();
       // wt3.interrupt();
        wt3.interrupt();
    }
}