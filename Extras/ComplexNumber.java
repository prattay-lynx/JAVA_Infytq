import Algebra.*;

public class ComplexNumber {
    public static void main(String[] args) {
        Algebra a = new Algebra(4,9);
        Algebra b = new Algebra(5,11);

        a.add(a,b);
        a.subtract(a,b);
    }
}
