import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class SortNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> r = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
            al.add(sc.nextInt());
        }
        Collections.sort(al);
        for(int i = 0;i<n;i++)
        {
            int s = al.get(i);
            s =(int)Math.pow(s,2);
            // System.out.print(s+" ");
            r.add(s);

        }
        Collections.sort(r);

        for(int i = 0;i<n;i++)
        {
            System.out.print(r.get(i)+" ");
        }
    }
}

/*PS C:\Users\tapas\Music\Java> javac SortNum.java
PS C:\Users\tapas\Music\Java> java SortNum      
4
-7 -2 3 1
1 4 9 49  */