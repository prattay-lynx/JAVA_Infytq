import java.util.Scanner;
public class Karprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int sqr = a*a;
        String str = Integer.toString(sqr);
        int len = str.length();
        int num = splitNum(sqr,len);
        if(num==a) System.out.println("The number is a karprekar number!!");
        else System.out.println("The number is not a karprekar!!");
    }
    public static int splitNum(int sqr,int len)
    {
        int num = sqr;
        int c =(int)Math.pow(10,(int)Math.ceil(len/2));
        int ld = num%c;
        int fd = num/c;
        return ld+fd;
    }
}
