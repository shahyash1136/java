public class Weather {
    public static void main(String[] args) {
        double noon = 77; // temperature at noon in fahrenheit.
        double evening = 61; // temperature during the evening in fahrenheit
        double midnight = 55; // temperature at midnight in fahrenheit

        // Task 3 - Call the printTemperatures function.
        double noonTempInCelsis = fahrenheitToCelsius(noon);
        printTemperatures(noon, noonTempInCelsis);

        double eveningTempInCelsis = fahrenheitToCelsius(evening);
        printTemperatures(evening, eveningTempInCelsis);

        double midnightTempInCelsis = fahrenheitToCelsius(midnight);
        printTemperatures(midnight, midnightTempInCelsis);

    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        // Task 1: Make a function here. See the doc comments below.

        /**
         * Function name: fahrenheitToCelsius - converts fahrenheit to celcius
         * 
         * @param fahrenheit (double)
         * @return celsius (double)
         * 
         *         Inside the function:
         *         1. returns the temperature in celcius. C = (F - 32) * 5/9.
         */
        double celcius = (fahrenheit - 32) * 5 / 9;
        return celcius;
    }

    public static void printTemperatures(double fahrenheit, double celcius) {
        // Task 2: Make a function here. See the doc comments below.

        /**
         * Function name: printTemperatures – prints both temperature values.
         * 
         * @param fahrenheit (double)
         * 
         *                   Inside the function:
         *                   1. prints: F: <temperature in fahrenheit>.
         *                   2. prints: C: <temperature in celsius> .
         */

        System.out.println("F: " + fahrenheit);
        System.out.println("C: " + celcius);

    }

}