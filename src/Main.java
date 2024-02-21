import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        Integer[] store = new Integer[2];

        int op;
        do {
            System.out.println("=".repeat(50));
            System.out.print("""
                    1. Enter numbers
                    2. View numbers
                    3. Exit
                    """);
            System.out.print("Choice option: ");
            op = scanner.nextInt();
            System.out.println("=".repeat(50));
            switch (op) {
                case 1:
                    int input;
                    do {
                        System.out.print("Input numbers (enter negative number to stop): ");
                        input = scanner.nextInt();
                        if (input >= 0) {
                            if (n >= store.length) {
                                Integer[] temp = new Integer[store.length * 2];
                                System.arraycopy(store, 0, temp, 0, store.length);
                                store = temp;
                            }
                            store[n++] = input;
                        }
                    } while (input >= 0);
                    break;
                case 2:

                    for (int i = 0; i < n; i++) {
                        System.out.print(store[i] + "\t");
                    }

                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (op != 3);
    }
}
