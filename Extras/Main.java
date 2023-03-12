class Caller{
   void call(String msg)
   {
    System.out.print("[" + msg);
   
   try 
   {
    Thread.sleep(100); 
   } 
   catch (InterruptedException e) 
   {
    System.out.println("Interrupted!!");
   }
   finally
   {
     System.out.print("]");
   }
}
}
class callme implements Runnable
{String name;Thread t;Caller target;
    public callme(Caller ta,String msg)
    {   target=ta;
        name = msg;
        t = new Thread(this);     
    }

    public void run()
    {
        synchronized(target){

        target.call(name);}
    }
}
public class Main {
    public static void main(String[] args)throws InterruptedException {
        Caller ta=new Caller();
        callme ob1=new callme(ta,"Hello");
        callme ob2=new callme(ta,"Synchronized");
        callme ob3=new callme(ta,"Block");
        ob1.t.start();
        ob2.t.start();
        ob3.t.start();
        ob1.t.join();
        ob2.t.join();
        ob3.t.join();
    }
}
