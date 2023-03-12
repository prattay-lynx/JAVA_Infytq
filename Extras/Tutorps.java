import java.util.Scanner;

public class Tutorps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ob = sc.next();
        // char arr [] = ob.toCharArray();
        int x = 0,y = 0;
        int len = ob.length();
        int k =0;
            for(int i = 0;i < len; i++)
            {
                if(ob.charAt(i) == 'z' || ob.charAt(i) == 'Z')
                 {
                    x++;
                 }
                else y++;
            }
        System.out.println("X:"+x+" "+"Y:"+y);
        if(2*x==y) System.out.println("Yes");
        else System.out.println("No");

    //     for(int i =0;i<len;i++)
    //     {
    //         count[i]=1;
    //         for(j = i+1;j<len;j++)
    //             {if(arr[i]==arr[j]) 
    //             {
    //                 count[i]++;
    //                 arr[j]='0';
    //             } 
    //         }       
    //     }
    //     for(int i =0;i<count.length;i++) 
    //     { if(arr[i]!=' ' && arr[i]!='0')
    //         {System.out.println(arr[i]+" "+count[i]);
    //             x=count[i];
    //             y=count[i+1];}
    // }
        // System.out.println(x+" "+y);

    }
}
