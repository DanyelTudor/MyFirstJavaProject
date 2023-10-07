package Lab3;

public class Operators {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        boolean result = a == b;
        System.out.println(result);
        System.out.println(a != b);
        System.out.println(a <= b);
        System.out.println(b > a);

        System.out.println(a > 0 && b > 0); // true and true = true
        System.out.println(a < 0 && b > 0); // false and true = False
        System.out.println(a > 0 && b < 0); // true and false = false
        System.out.println(a < 0 && b < 0); // false and false = false

        System.out.println(a > 0 || b > 0); // true or true = true
        System.out.println(a < 0 || b > 0); // false or true = true
        System.out.println(a > 0 || b < 0); // true or false = true
        System.out.println(a < 0 || b < 0); // false or false = false

    }
}