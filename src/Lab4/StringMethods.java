package Lab4;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Ana are mere!";
        String str = new String("Ana are mere!");

        // lungimea unui string
        System.out.println(str.length());  // 13

        System.out.println(str.substring(4)); // are mere!
        System.out.println(str.substring(4, 7)); // are

        System.out.println(str.charAt(9)); // e

        char[] letters = str.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (i % 2 == 0) {
                System.out.print(letters[i]);
            }
        }
        System.out.println();

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String email = "   Marchisdaniel31@gmail.com   ";
        String emailFromDataBase = "marchisdaniel31@gmail.com";
        if (email.trim().toLowerCase().equals(emailFromDataBase.toLowerCase())) {
            System.out.println("Correct");
        }

        String name = "Marchis Daniel";
        String[] tokens = name.split(" ");
        System.out.println("First name: " + tokens[0]);
        System.out.println("Last name: " + tokens[1]);

        int indexOfX = name.indexOf('s'); // 3
        int lastIndexOfE = name.lastIndexOf('e'); //12

        boolean containsDaniel = name.contains("Daniel"); // true

        System.out.println(str.replace('a', '*'));
        System.out.println(str.replaceAll("a", "aoa"));

        System.out.println(str);
    }
}