package Lab4;

import java.util.Random;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(15));

        // 1 - 0
        // 2 - x
        int[][] table = new int[3][3];
        printTable(table);

        table[0][0] = 1;
        printTable(table);

        table[1][1] = 2;
        printTable(table);

        table[2][2] = 1;
        printTable(table);

        table[0][2] = 2;
        printTable(table);

        table[2][0] = 1;
        printTable(table);

        table[1][0] = 2;
        printTable(table);

        table[2][1] = 1;
        printTable(table);
    }

    public static void printTable(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }
}