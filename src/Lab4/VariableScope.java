package Lab4;

public class VariableScope {
    public static void main(String[] args) {
        int a = 1;
        anotherMethod(a);
        thirdMethod(a);
        int c = 3;
        if (a == 1) {
            int b = 2;
            System.out.println(a + b);
        } else {
            // a is still visible
            // b is not visible
            // int a = 2; // compile error
            System.out.println(c);
        }
    }

    public static void anotherMethod(int oriceNume) {
        System.out.println(oriceNume);
        thirdMethod(oriceNume);
    }

    public static void thirdMethod(int altNume) {
        if (altNume > 0) {
            //do something
        }
    }
}

//

/*

*/

/**
 *This is a method that print out the parameter
 */