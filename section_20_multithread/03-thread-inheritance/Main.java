public class Main {

    public static void main(String[] args) {
        AtheleteThread firstAthlete = new AtheleteThread("Marcus Eldrige", Thread.MAX_PRIORITY, 84291);
        AtheleteThread secondAthlete = new AtheleteThread("Hiroshi Nakmura", Thread.MIN_PRIORITY, 43114);

        // Starting the threads
        firstAthlete.start();
        secondAthlete.start();
    }
}