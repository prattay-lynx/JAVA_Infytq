class Thread1 implements Runnable
{    
     String threadname;
     Thread t;
     public Thread1(String threadname) /*constructor */
     {
        this.threadname = threadname;
        t = new Thread(this,threadname);
        System.out.println(threadname + t);
     }
     public void run()
     {
        try{
            for(int i = 5 ;i>0 ; i--)
            {
                System.out.println(threadname +":"+i);
                Thread.sleep(50);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("The thread "+ threadname +" interrupted!!");
        }
        finally{
            System.out.println("The thread "+ threadname +" terminated!!");
        }
     }
}
class MyThread 
{
    public static void main(String args[]) throws InterruptedException
    {
        Thread1 one = new Thread1("One");
        Thread1 two = new Thread1("Two");
        
        Thread th1 = new Thread(one);
        Thread th2 = new Thread(two);

        th1.start();
        th2.start();
        
        System.out.println("The thread one is alive?:" +th1.isAlive());
        System.out.println("The thread one is alive?:" +th2.isAlive());

        th1.join();
        th2.join();

        Thread th = Thread.currentThread();
        th.setName("MainThread");
        System.out.println("The main thread after name change:"+th);
        try{
            for(int i = 5 ;i>0 ; i--)
            {
                System.out.println("Main thread:"+i);
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("The main thread interrupted!!");
        }
        finally{
            System.out.println("The main thread terminated!!");
            System.out.println("The thread one is alive?:" +th1.isAlive());
            System.out.println("The thread one is alive?:" +th2.isAlive());
        }
    }
}