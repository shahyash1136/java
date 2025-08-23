import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (Workbook 6.4).

        Scanner scan = new Scanner(System.in);

        String[] store = { "apples", "bananas", "candy", "chocolate", "coffee", "tea" };
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");
        String userInput = scan.nextLine();

        for (int i = 0; i < store.length; i++) {
            if (store[i].equals(userInput)) {
                // Task 2 here
                System.out.println("\nWe have that in aisle: " + i);
                break;
            }

        }

        scan.close();

        // Compare your result to what's on Learn the Part.

    }
}
