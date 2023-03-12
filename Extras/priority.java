class MyThread extends Thread{

 String name;
 Thread t;
 private int count =0;
 private volatile boolean running = true;
 public MyThread(String threadname,int p)
 {
    name = threadname;
    t = new Thread(this,name);
    System.out.println(name + t);
    t.setPriority(p);
 }
 public void run()
 {
    while(running) count++;
 }
 public void stop1() 
 {
    running = false;
 }
 public int getCount()
 {
    return count;
 }
}


public class priority {
    public static void main(String[] args)throws InterruptedException{
        MyThread th = new MyThread("high",Thread.NORM_PRIORITY+2);
        MyThread th1 = new MyThread("low",Thread.NORM_PRIORITY-2);

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);/*max priority is set to the main thread*/

        th.start();
        th1.start();
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e)
        {
            System.out.println("The main thread is interrupted!!");
        }
        finally{
            System.out.println("The main thread terminates!!");
        }
        th.stop1();
        th1.stop1();
        
        th.t.join();
        th1.t.join();

        System.out.println("The high priority Thread:"+th.getCount());
        System.out.println("The low priority Thread:"+th1.getCount());
        System.out.println("The difference in priorities:"+(th.getCount()-th1.getCount()));
    }
}
