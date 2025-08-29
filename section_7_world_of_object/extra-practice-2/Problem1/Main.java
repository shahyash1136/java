/* *
  Create a Player class with:
    •	Fields: name, team, runs[] (last 5 innings)
    •	Constructors:
        o	default constructor
        o	parameterized constructor
        o	copy constructor (both shallow & deep copy)
    •	Getters/Setters:
        o	Ensure name is always capitalized.
        o	Ensure runs[] cannot be set to null.
    •	Methods:
        o	getAverageRuns() → return average of runs.
        o	printPlayer() → print player details.
👉 Tasks:
        1.	Create 5 players with dummy data using the parameterized constructor.
        2.	Make a shallow copy of one player and show that changing the runs in original affects copied one.
        3.	Make a deep copy of the same player and show that changes in runs don’t affect copied one.
        4.	Use getter/setter to update name & runs with validations.
📌 Dummy Data for Players (5 rows)
        Name	Team	Runs (last 5 innings)
        Virat Kohli	RCB	[72, 34, 88, 12, 55]
        Rohit Sharma	MI	[45, 67, 22, 10, 89]
        MS Dhoni	CSK	[15, 20, 10, 25, 5]
        Jos Buttler	RR	[100, 45, 23, 56, 78]
        KL Rahul	LSG	[60, 12, 44, 90, 33]
 * 
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("----- Testing Default Constructor -----");
        Player defaultPlayer = new Player();
        defaultPlayer.printPlayer();

        // ✅ Create 5 players with dummy data (Parameterized Constructor)
        System.out.println("\n----- Creating Players with Dummy Data -----");
        Player player1 = new Player("Virat Kohli", "RCB", new int[] { 72, 34, 88, 12, 55 });
        Player player2 = new Player("Rohit Sharma", "MI", new int[] { 45, 67, 22, 10, 89 });
        Player player3 = new Player("MS Dhoni", "CSK", new int[] { 15, 20, 10, 25, 5 });
        Player player4 = new Player("Jos Buttler", "GT", new int[] { 100, 45, 23, 56, 78 });
        Player player5 = new Player("KL Rahul", "DC", new int[] { 60, 12, 44, 90, 33 });

        player1.printPlayer();
        player2.printPlayer();
        player3.printPlayer();
        player4.printPlayer();
        player5.printPlayer();

        // ✅ Shallow Copy
        System.out.println("\n----- Testing Shallow Copy -----");
        Player shallowCopy = new Player(player1, true); // shallow copy
        System.out.println("Before modifying original:");
        player1.printPlayer();
        shallowCopy.printPlayer();

        // change original runs
        int[] newRuns = player1.getRuns();
        newRuns[0] = 0;
        player1.setRuns(newRuns);

        System.out.println("After modifying original:");
        player1.printPlayer();
        shallowCopy.printPlayer(); // should also change (same reference)

        // ✅ Deep Copy
        System.out.println("\n----- Testing Deep Copy -----");
        Player deepCopy = new Player(player2, false); // deep copy
        System.out.println("Before modifying original:");
        player2.printPlayer();
        deepCopy.printPlayer();

        // change original runs
        int[] newRuns2 = player2.getRuns();
        newRuns2[1] = 0;
        player2.setRuns(newRuns2);

        System.out.println("After modifying original:");
        player2.printPlayer();
        deepCopy.printPlayer(); // should remain unchanged

        // ✅ Testing Setters
        System.out.println("\n----- Testing Setters -----");

        // Name auto-capitalize
        Player testPlayer = new Player();
        testPlayer.setName("sachin tendulkar");
        testPlayer.setRuns(new int[] { 10, 20, 30, 40, 50 });
        testPlayer.printPlayer(); // name should appear as Sachin Tendulkar

        // Negative runs validation
        System.out.println("\nTrying to set negative runs...");
        testPlayer.setRuns(new int[] { 10, -5, 30, 40, 50 }); // should give error

        // Null runs validation
        System.out.println("\nTrying to set runs = null...");
        testPlayer.setRuns(null); // should give error

    }
}
