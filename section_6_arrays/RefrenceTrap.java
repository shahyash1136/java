import java.util.Arrays;

public class RefrenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = { "Tommy", "Joel", "Ellie" };
        /*
         * String[] staffThisYear = new String[3];
         * 
         * for (int i = 0; i < staffThisYear.length; i++) {
         * staffThisYear[i] = staffLastYear[i];
         * }
         */
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);

        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));

    }
}
