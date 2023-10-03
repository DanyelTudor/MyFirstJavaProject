package Lab2;

public class Curs2Homework {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers());
    }

    public static Object sumOfNumbers(){
        int intVariable = 1;
        double doubleVariable = 2.5;
        short shortVariable = 5;
        long longVariable = 9;

        double sum = intVariable + doubleVariable + shortVariable + longVariable;

        System.out.println("Suma variabilelor este: " + sum);
        
        return null;
    }
}