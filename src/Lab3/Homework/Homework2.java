package Lab3.Homework;

public class Homework2 {
    public static void main(String[] args) {
        byte a = 7;
        printIfGreaterThanTen(a);
        printIfGreaterThanTen((byte) 13);

        System.out.println(max(14, 26));

        System.out.println(max(43, 12, 56));
        System.out.println(max(2, 4, 6, 1));
    }

    // 1*
    public static void printIfGreaterThanTen(byte param) {
        if (param > 10) {
            System.out.println("Greater than ten");
        }
    }


    // 3*
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }


    // 4*
    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }
}