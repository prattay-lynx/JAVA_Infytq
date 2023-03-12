public class StringFind {

    public static int countSubstring(String inputString, String substring, int count) {
        if (inputString.contains(substring))
            return 1 + countSubstring(inputString.replaceFirst(substring, ""), substring, count);
        // Implement your code here and change the return value accordingly
        return 0;
    }

    public static void main(String args[]) {
        int count = countSubstring(
                "I felt happy because I saw the others were Happy and because I knew I should feel happy, but I was not really happy",
                "Happy", 0);
        System.out.println(count);
    }
}