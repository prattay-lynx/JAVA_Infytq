 import java.util.Scanner;

 class Pattern2 {
    public static boolean checkString(String name)
    {
        String regex1 = "(^[\\w]+$)";
        if(name.matches(regex1)) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String name = sc.next();

        System.out.format("The name is: %s",checkString(name)?"valid" : "Invalid");
    }
}
