package Lab4;

public class BranchControl {
    public static void main(String[] args) {
        continueMethod();
    }

    public static void breakMethod() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i == 10) {
                break;
            }
        }
        System.out.println("Finished!");
    }

    public static int firstEvenNumber() {
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void returnVoidMethod() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i == 10) {
                return;
            }
        }
        System.out.println("Finished!");
    }

    public static void continueMethod() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
            // 1000 lines of code
        }
    }
}