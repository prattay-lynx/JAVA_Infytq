import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 

public class Photograph
{
    public static boolean check(ArrayList<Integer> rs,ArrayList<Integer> bs,int n,boolean flag)
    {
        Collections.sort(rs);
        Collections.sort(bs);

        // flag = rs.get(0) < bs.get(0);

        for (int i = 0; i < n; i++) {
            int r = rs.get(i);
            int b = bs.get(i);

        if(r >= b) flag = false;
        else flag = true;
    }
    return flag;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int n = sc.nextInt();
       ArrayList<Integer> rs = new ArrayList<Integer>();
       ArrayList<Integer> bs = new ArrayList<Integer>();

       for (int i = 0; i < n; i++) {
            rs.add(sc.nextInt());
       }
       for (int i = 0; i < n; i++) {
        bs.add(sc.nextInt());
      }

      boolean sp = check(rs,bs,n,flag);

      System.out.println(sp);
    }
}