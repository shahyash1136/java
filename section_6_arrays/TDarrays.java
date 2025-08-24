import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        /*
         * int[][] grades = new int[3][4];
         * grades[0][0] = 72;
         * grades[0][1] = 74;
         * grades[0][2] = 78;
         * grades[0][3] = 76;
         * 
         * grades[1][0] = 65;
         * grades[1][1] = 64;
         * grades[1][2] = 61;
         * grades[1][3] = 67;
         * 
         * grades[2][0] = 95;
         * grades[2][1] = 98;
         * grades[2][2] = 99;
         * grades[2][3] = 100;
         */

        int[][] grades = {
                { 72, 74, 78, 76 },
                { 65, 64, 61, 67 },
                { 95, 98, 99, 100 },
        };

        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + Arrays.toString(grades[1]));
        System.out.println("\tHermione: " + Arrays.toString(grades[2]));

        for (int i = 0; i < grades.length; i++) {
            System.out.print("\n");
            switch (i) {
                case 0:
                    System.out.print("\tHarry: ");
                    break;
                case 1:
                    System.out.print("\tRon: ");
                    break;
                case 2:
                    System.out.print("\tHermione: ");
                    break;
                default:
                    break;
            }

            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
        }

    }
}
