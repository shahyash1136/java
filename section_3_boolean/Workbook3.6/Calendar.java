public class Calendar {
    public static void main(String[] args) {

        // See Learn the Part for the complete instructions (link in resources folder of
        // Udemy video).

        String day = "Friday"; // Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");

        System.out.println("Hmm, let me check my calendar.");

        // Check 'calendar' here:

        switch (day) {
            case "Monday":
                System.out.println("Sorry, I have to stay at work late.");
                break;
            case "Tuesday":
                System.out.println("It looks like I have meetings all day.");
                break;
            case "Wednesday":
                System.out.println("I have a dentist appointment. Some other time!");
                break;
            case "Thursday":
                System.out.println("Sorry, thursday is date night!");
                break;
            case "Friday":
                System.out.println("I'm free!!");
                break;
            case "Saturday":
                System.out.println("I'm free!!");
                break;
            case "Sunday":
                System.out.println("I'm free!!");
                break;

            default:
                System.out.println("That's not a day.");
                break;
        }

        /*
         * Check that day against 7 days from your calendar.
         * 
         * case Monday, print:
         * 
         * Sorry, I have to stay at work late.
         * 
         * case Tuesday, print:
         * 
         * It looks like I have meetings all day.
         * 
         * case Wednesday, print:
         * 
         * I have a dentist appointment. Some other time!
         * 
         * case Thursday, print:
         * 
         * Sorry, thursday is date night!
         * 
         * case Friday, print:
         * 
         * I'm free!!
         * 
         * case Saturday, print:
         * 
         * I'm free!!
         * 
         * case Sunday, print:
         * 
         * I'm free!!
         * 
         * default:
         * 
         * That's not a day.
         */

    }
}
