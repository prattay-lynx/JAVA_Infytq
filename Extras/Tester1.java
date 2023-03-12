import java.util.Scanner;
import java.lang.Math;

class Tester1 {
    private static int n,r;
    private static final int a=1;
	public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
		// Implement your code here 
        try
        {
            System.out.println("Enter the value of n:");
            n = sc.nextInt();
            r=2;
            for(int i=0;i<n;i++)
            {   
                System.out.print(a*(int)(Math.pow(r,i))+" "); 
            }
        }
        catch(Exception e) 
        {
            System.out.println(e.getMessage());
        }
        sc.close();
	}
   
}