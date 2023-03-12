import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/*[1,2,5]*/
public class CV {
    public static void main(String[] args) {
        int change = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i =0;i<n;i++)
        {
            al.add(sc.nextInt());
        }
        Collections.sort(al);
        int c = 0;  //here the change is taken
        for(int i = 0;i<al.size();i++)
        {
            if(al.get(i)>c+1) break;
            c+=al.get(i);             //1>1+1   ...  2>2+1 ... 5>3+1
        }
        System.out.println(c+1);
    }
}
/*3  
1 2 5
4 */
