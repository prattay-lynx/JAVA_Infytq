import java.util.Scanner;

interface Test
{
   public int quantity(Scanner sc);
   public String showmenu(Scanner sc);
   public int distance(Scanner sc,int d);
}
public class Tester2 implements Test {
    private static final int v=12;
    private static final int n=15;
    private String choice;

    public void billCalc(String ch,int q,int d,int charge)
    {
        int fin_amount=0;
        if(ch=="V") fin_amount=(v*q+charge);
        else fin_amount=(n*q+charge);
        System.out.println("The final amount is:"+fin_amount);
    }

    public int distance(Scanner sc,int d)
    {
        int charges;
        charges=0;
        if(d==3) return charges;
        else if(d>3) 
        {
            d=d-6;
            charges=d*2 + 1;
            return charges;
        }
        else
        {
            System.out.println("-1");
            System.exit(0);
            return -1;
        }       
    }

    public int quantity(Scanner sc)
    {
        System.out.print("Enter the order quantity:");
        int q = sc.nextInt();
        return q;
    }
    public String showmenu(Scanner sc)
    {
       System.out.println("Enter your meal choice:");
       System.out.println("1.Vegetarian(V)\n2.Non-Vegetarian(N)");
       choice=sc.next();
       return choice;
    }
    public static void main(String[] args) 
    {
        Tester2 test = new Tester2();
        Scanner sc = new Scanner(System.in);
        int q,d,charges;
        try
        {
            test.choice=test.showmenu(sc);
            if(test.choice.equals("N") || test.choice.equals("V"))
            {
               System.out.println();
            }
            else
            {
                System.out.println("-1");
                System.exit(0);
            }
            q=test.quantity(sc);
            if(q<1)
            {
               System.out.println("-1");
               System.exit(0); 
            }
            System.out.println("Enter the distance:");
            d=sc.nextInt();
            charges=test.distance(sc,d);

            /*Final bill calculation */
            test.billCalc(test.choice,q,d,charges);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}
