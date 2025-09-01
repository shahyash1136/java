import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = promptForTitle(scanner);
        String publisher = promptForPublisher(scanner);
        int issueNumber = promptForIssueNumber(scanner);
        int publicationYear = promptForPublicationYear(scanner);

        Magazine newMagazine = new Magazine(title, publisher, issueNumber, publicationYear);

        MagazineLibrary library = new MagazineLibrary();
        library.addMagazine(newMagazine);

        System.out.println("Magazine added to the library: " + newMagazine.getTitle());
    }

    public static boolean isNullOrBlank(String input) {
        return (input == null || input.isBlank());
    }

    public static boolean incorrectIssueNumber(int issueNumber) {
        // TODO
        return (issueNumber <= 0);
    }

    public static boolean publicationYear(int publicationYear) {
        // TODO
        return publicationYear <= 0;
    }

    public static String promptForTitle(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid title: ");
            /*
             * if (!scanner.hasNextLine()) {
             * scanner.next();
             * continue;
             * }
             */

            String title = scanner.nextLine();
            if (!isNullOrBlank(title)) {

                return title;
            }
        }
    }

    public static String promptForPublisher(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid publisher: ");
            /*
             * if (!scanner.hasNextLine()) {
             * scanner.next();
             * continue;
             * }
             */

            String publisher = scanner.nextLine();
            if (!isNullOrBlank(publisher)) {
                return publisher;
            }
        }
    }

    public static int promptForIssueNumber(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid issue number (greater than 0): ");
            // First check if the next input is not an integer
            // scanner.next();
            // continue;
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }

            int issueNumber = scanner.nextInt();
            if (!incorrectIssueNumber(issueNumber)) {
                return issueNumber;
            }

            // TODO
        }
    }

    public static int promptForPublicationYear(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid publication year (greater than 0): ");
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }

            int publicationYear = scanner.nextInt();
            if (!publicationYear(publicationYear)) {
                return publicationYear;
            }
        }
    }
}