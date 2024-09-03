
import java.lang.*;
import java.io.*;
import java.util.*;
// using extending thread interface
class Multithread extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(this.getName() + " is running and iteration number is "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
        System.out.println(this.getName()+" has finished execution");
    }
}

public class MT_demo {
    public static void main(String[] args) {
        Multithread t1=new Multithread();
        Multithread t2=new Multithread();
        Multithread t3=new Multithread();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println("ALL threads have finished execution");
    }
}


