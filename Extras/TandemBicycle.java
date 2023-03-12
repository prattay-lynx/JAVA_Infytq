import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TandemBicycle {

    public static int check(ArrayList<Integer> rs,ArrayList<Integer> bs,int n,boolean fastest)
    {
            int sp = 0;

            if(fastest) {
                Collections.sort(rs,Collections.reverseOrder());
                Collections.sort(bs);
            }

            for (int i = 0; i < n; i++) {
                sp+=Math.max(rs.get(i),bs.get(i));
            }

            return sp;
    }
    public static void main(String [] args)
    {   boolean fastest = true; int speed = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fastest = sc.nextBoolean();

        ArrayList<Integer> rs = new ArrayList<Integer>();
        ArrayList<Integer> bs = new ArrayList<Integer>();

        for(int i=0;i<n;i++)
        {
            rs.add(sc.nextInt());
        }
        
        for (int i = 0; i < n; i++) {
            bs.add(sc.nextInt());
        }

        speed = check(rs,bs,n,fastest);

        System.out.println(speed);

    }
}
