import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Codechef3{
 private static int N,s=0,m=0,j=0,l=0;
 private static int MAX;
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int k=0;
        int take=0;
		Codechef3 c = new Codechef3();
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        int []a;
        ArrayList<Integer> al= new ArrayList<Integer>();
        Set<Integer> d = new HashSet<>(al);
		while(T>0)
		{
            MAX = Integer.MIN_VALUE;
            N = sc.nextInt();
            a=new int[N];
            for(int i=0;i<N;i++)
            {
                al.add(sc.nextInt());
            }
            k=0;
            for(Integer s: d)
                {
                    a[j]=Collections.frequency(al,s);  
                    j++;
                }
                for(j=0;j<N;j++)
                    if(a[j]>MAX)
                        { MAX=a[j]; take=s; }
                System.out.println(take);
            for(int i=0;i<N;i++)
            {
                if( al.get(k) == al.get(i) )
                {
                    l=al.get(k);
                    continue;
                }
                else
                {
                    al.set(i,take);
                    m++;
                }
            }
            System.out.println(m);
            al.removeAll(al);
            j=0;
            m=0;
		    T--;
	    }
        sc.close();
    }
}