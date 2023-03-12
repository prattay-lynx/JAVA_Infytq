
public class Abundant{
    public static void main(String[] args) {
        int a = 12; int sum = 0;
        for(int i = 1;i<=a/2;i++)
        {
            if(i%a==0) sum+=i;
        }
        if(sum<a) System.out.println("not an abundant number");
        else System.out.println("Abundant number");
    }
}