package Lab3;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 2 + 3 * 2;
        System.out.println(a);

        int b = 2;
        int c = ++b + 1; //c ==4

        boolean result = !true || false && true;
    }
}