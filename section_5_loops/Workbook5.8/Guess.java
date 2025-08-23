import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        int screatNum = 4;
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");

        Scanner scan = new Scanner(System.in);

        // See Learn the Part for detailed instructions.
        int guessNum = scan.nextInt();

        while (screatNum != guessNum) {
            System.out.print("Guess again: ");
            guessNum = scan.nextInt();
        }
        System.out.println("You got it!");

        scan.close();
    }

}
