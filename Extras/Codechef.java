/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Collection;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   public int N,j=0,m=0;
    public void result(int p,int q)
    {
       System.out.println(p+" "+q);
    }
   
	public static void main (String[] args) throws Exception
	{
		// your code goes here
		Codechef c = new Codechef();
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        ArrayList<String> al = new ArrayList<String>();
		while(T>0)
		{
		    c.N=sc.nextInt();
            for(int i=0;i<c.N;i++)
		        al.add(sc.next());
            // System.out.println(al);
            for(int i=0;i<c.N;i++)
                {
                    if(al.get(i).equals("START38")) 
                        { c.j++; }
                    if(al.get(i).equals("LTIME108"))
                        { c.m++; }
                }
                c.result(c.j,c.m);
                al.removeAll(al);
                // System.out.println(al);
                c.j=0;c.m=0;
		    T--;
		} 
        sc.close();
	}
}
