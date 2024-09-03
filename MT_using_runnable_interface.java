import java.lang.*;
import java.io.*;

class running implements Runnable{
    @Override
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" iteration is "+ i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

public class MT_using_runnable_interface {
   public static void main(String[] args) {
    running count = new running();
    Thread t1=new Thread(count,"Thread-1");
    Thread t2=new Thread(count,"Thread-2");
    Thread t3=new Thread(count,"Thread-3");

    t1.start();
    t2.start();
    t3.start();
   } 
}
