public class HighScore {
    public static void main(String[] args) {

        int highScore = 0;

        // Instructions for this workbook are on Learn the Part (Workbook 6.5).
        int[] numbers = { randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber() };

        System.out.print("Here are the scores: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            if (numbers[i] > highScore) {
                highScore = numbers[i];
            }
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");

    }

    /**
     * Function name - randomNumber
     * 
     * @return (int)
     *
     *         Inside the function
     *         - returns a random number between 0 to 49999
     *
     */
    public static int randomNumber() {
        return (int) (Math.random() * 49999) + 1;
    }

}
