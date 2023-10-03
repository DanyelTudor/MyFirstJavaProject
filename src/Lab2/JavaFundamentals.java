package Lab2;

public class JavaFundamentals {
    int a; //field
    int b; //field
    static int c; // field static
    static final double EARTH_GRAVITY = 9.81;

    public static void main(String[] args) {
        System.out.println(sumOfTwoNumbers(2, 3));
        System.out.println(sumOfTwoNumbers(12, 5));
        System.out.println(getOne());
        System.out.println(myMethod("Phone", 3999));

        int firstNumber;
        firstNumber = 23;
        int secondNumber = 21;
        System.out.println(sumOfTwoNumbers(firstNumber, secondNumber));
    }

    public static int sumOfTwoNumbers(int a, int b) {
        getOne();
        return a + b;
    }

    public static int getOne() {
        return 1;
    }

    public static String myMethod(String product, int price) {
        return product + " has price of " + price;
    }

    // ^^^ "String product"/"int price" parametru

    public static void primitives() {
        int a = 2147483647;
        short b = 32767;
        byte c = 127;
        long d = 2147483648L;
        float e = 43546.123456F;
        double f = 123414.123456789012345;
        boolean g = true;
        char h = 'c';
        byte i;
        i = 1;

        // ^^^ variabile

        int aa = 15;
        int bb = a;
        aa = 20; // bb remains 15
    }

    public static void arrayVariables() {
        int[] numbers;
        numbers = new int[10];
        boolean[] flags = new boolean[4];
        char[] letters = new char[]{'a', 'b', 'c', 'd'};

        System.out.println(letters[2]);
    }

    public static void division() {
        int a = 3;
        int b = 2;
        System.out.println(a / b); // 3/2 = 1 catul impartirii la 2
        System.out.println(a % b); // 3%2 = 1 restul impartirii la 2

        double c = 3.2;
        int d = 2;
        System.out.println(c / d); // 3.2 / 2 = 1.6
    }
}