import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag=0;
        System.out.println("Enter the Number:");
        int s=sc.nextInt();
        int ld,fd=0;
        String str=Integer.toString(s);
        int len=str.length();
        System.out.println(len);
        int num=s;
        int l=0;
        for(int i=0;i<len/2;i++)
        {
            // l=num;
            while(num!=0)
            {
                ld = num%10;
                l=(l*10)+ld;
                num=num/10;        
            }
            // if(fd==ld)
            // {
            //     flag=1;
            // }
            // else flag=0;
            
            // s=s/10;
            
        }
        if(l!=s) System.out.println("The number is not palindrome!!");
        else System.out.println("The number is palindrome!!");
        sc.close();
    }
    
}
