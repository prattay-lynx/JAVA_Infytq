public class Pattern {

    public static boolean checkNameValidity(String name) {
        // Implement your code here and change the return value accordingly
        // boolean flag = false;
        String regex1 = "^([A-Z]{1}[A-Za-z]{1,11})+(?:\\s[A-Z]{1}[A-Za-z]{1,8})?(?:\\s[A-Z]{1}[A-Za-z]{2,8})?$";
        if (name.matches(regex1))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        // Change the value of name for testing your code with different names
        String name = "Roger Federer";
        System.out.println("The name is " + (checkNameValidity(name) ? "valid!" : "invalid!"));
    }
}
/*
 * Output:
 * The name is valid!
 */