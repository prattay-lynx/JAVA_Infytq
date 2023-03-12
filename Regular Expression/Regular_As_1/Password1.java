public class Password1 {

    public static boolean checkPasswordValidity(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[#!@$%&*_])([a-zA-Z0-9#!@$%&*_]{8,20})$";
        // Implement your code here and change the return value accordingly
        if (password.matches(regex))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        // Change the value of password for testing your code with different passwords
        String password = "P@$sW0rd";
        System.out.println("The password is " + (checkPasswordValidity(password) ? "valid!" : "invalid!"));
    }

}