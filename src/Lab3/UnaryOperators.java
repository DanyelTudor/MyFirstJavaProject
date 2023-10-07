package Lab3;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = +3;
        int aa = 3;
        int b = -2;
        int c = -a; //-3

        int d = aa++; // aa = 3 > 4; d=3
        int e = ++aa; // aa = 4 > 5; e=4

        int after = 2, before = 2;
        System.out.println(after++);
        System.out.println(after);
        System.out.println(++before);
        System.out.println(before);

        boolean isTrue = true;
        boolean isFalse = !isTrue;

    }
}