/*Vasya likes the number 239. Therefore, he considers a number pretty if its last digit is 2, 3 or 9.

Vasya wants to watch the numbers between LL and RR (both inclusive), so he asked you to determine how many pretty numbers are in this range. Can you help him?

Input
The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
The first and only line of each test case contains two space-separated integers LL and RR.
Output
For each test case, print a single line containing one integer — the number of pretty numbers between LL and RR.

Constraints
1 \le T \le 1001≤T≤100
1 \le L \le R \le 10^51≤L≤R≤10 
5 */

import java.util.Scanner;

class Codechef2{
private static int L,R,m;
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        m=0;
		Codechef2 c = new Codechef2();
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
		    L=sc.nextInt(); R=sc.nextInt();
            if(R<L) break;
            else
            {
                for(int i=L;i<=R;i++)
                {
                    if(i%10==2||i%10==3||i%10==9)
                    // System.out.print(i+" ");
                    m++;
                }
                System.out.print(m);
            }
            m=0;
		    T--;
	    }
        sc.close();
    }
}