public class Championship {
    public static void main(String[] args) {

        // See Learn the Part for the complete instructions (link in resources folder of
        // Udemy video).

        int gryffindor = 400; // gryffindor points
        int ravenclaw = 200; // ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        int margin = gryffindor - ravenclaw;
        if (margin >= 300) {
            System.out.println("Gryffindor takes the house cup!");
        } else if (margin >= 0) {
            System.out.println("In second place, Gryffindor!");
        } else if (margin >= -100) {
            System.out.println("In third place, Gryffindor!");
        } else {
            System.out.println("In fourth place, Gryffindor!");
        }

        /*
         * If gryffindor wins by a margin of 300 points or more, print:
         * 
         * Gryffindor takes the house cup!
         * 
         * If gryffindor wins by a margin of any points or ties, print:
         * 
         * In second place, Gryffindor!
         * 
         * If gryffindor loses within 100 points, print:
         * 
         * In third place, Gryffindor!
         * 
         * else, print:
         * 
         * In fourth place, Gryffindor!
         */
    }
}
