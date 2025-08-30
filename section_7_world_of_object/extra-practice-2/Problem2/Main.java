import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
         * 🔹 Question 2: Team Class with Mutable Arrays
         * Create a Team class with:
         * • Fields: teamName, players[] (array of Player objects)
         * 
         * • Constructors:
         * o default
         * o parameterized (teamName, players[])
         * o copy constructor (deep copy only)
         * 
         * • Methods:
         * o addPlayer(Player p) → add new player
         * o printTeam() → print all players in team
         * o getTeamAverage() → return average runs of all players
         * 
         * 👉 Tasks:
         * 1. Create 2 Teams (RCB, MI) with 5 players each (use dummy data).
         * 2. Show what happens if you do shallow copy of team players[] (outside
         * modification changes inside).
         * 3. Fix it by doing deep copy in constructor.
         * 4. Use getters/setters for defensive copying (to prevent external
         * modification of players array).
         * 
         * 📌 Dummy Data for Teams (10 players total)
         * 
         * RCB Players
         * • Virat Kohli – [72, 34, 88, 12, 55]
         * • Faf du Plessis – [44, 67, 23, 12, 78]
         * • Glenn Maxwell – [10, 55, 32, 80, 22]
         * • Rajat Patidar – [15, 36, 44, 25, 11]
         * • Mohammed Siraj – [0, 12, 5, 0, 8]
         * 
         * MI Players
         * • Rohit Sharma – [45, 67, 22, 10, 89]
         * • Ishan Kishan – [12, 34, 56, 44, 22]
         * • Suryakumar Yadav – [99, 45, 0, 77, 34]
         * • Hardik Pandya – [23, 56, 33, 12, 60]
         * • Jasprit Bumrah – [2, 5, 0, 3, 1]
         * 
         * ✅ Testing Checklist
         * 🔹 2. Team Class
         * 
         * • Parameterized Constructor with Array
         * o Create a team with 5 players.
         * o Verify all players are correctly stored.
         * 
         * • Shallow Copy of Team
         * o Copy team → change one player’s runs in original → check if copied team
         * changes too.
         * o ✔ Expected: Copied team also changes (shared reference).
         * 
         * • Deep Copy of Team
         * o Copy team → change one player’s runs in original → check if copied team
         * stays intact.
         * o ✔ Expected: Copied team remains unchanged.
         * 
         * • addPlayer() Method
         * o Add a new player → check if size increases and player is stored correctly.
         * 
         * • getTeamAverage() Method
         * o Verify the average runs calculation is correct for the whole team.
         * 
         * • Defensive Copying in Getters
         * o Get players array → try modifying outside the class → check if internal
         * data remains safe.
         */
        // ✅ Default Constructor
        System.out.println("\n----- Testing Default Constructor -----");
        Team defaulTeam = new Team();
        defaulTeam.printTeam();

        Player[] playeraArr1 = new Player[] { new Player("Virat Kohli", new int[] { 72, 34, 88, 12, 55 }),
                new Player("Faf du Plessis", new int[] { 44, 67, 23, 12, 78 }),
                new Player("Glenn Maxwell", new int[] { 10, 55, 32, 80, 22 }),
                new Player("Rajat Patidar", new int[] { 15, 36, 44, 25, 11 }),
                new Player("Mohammed Siraj", new int[] { 0, 12, 5, 0, 8 }) };

        Player[] playeraArr2 = new Player[] { new Player("Rohit Sharma", new int[] { 45, 67, 22, 10, 89 }),
                new Player("Ishan Kishan", new int[] { 12, 34, 56, 44, 22 }),
                new Player("Suryakumar Yadav", new int[] { 99, 45, 0, 77, 34 }),
                new Player("Hardik Pandya", new int[] { 23, 56, 33, 12, 60 }),
                new Player("Jasprit Bumrah", new int[] { 2, 5, 0, 3, 1 }) };

        Team t1 = new Team("RCB", playeraArr1);
        Team t2 = new Team("RCB", playeraArr2);

        System.out.println("\n---- Shallow Copy of Team ----");
         

        System.out.println("\n----- Print Team Details -----");
        t1.printTeam();
        t2.printTeam();

        Player p1 = new Player("a b deviliers", new int[] { 25, 15, 30, 55, 75 });
        Player p2 = new Player("sachine tendulkar", new int[] { 0, 100, 70, 55, 75 });
        t1.addPlayer(p1);
        t2.addPlayer(p2);

        System.out.println("\n----- Modified Team Details -----");
        t1.printTeam();
        t2.printTeam();

        System.out.println("\n----- Get Team Average -----");
        System.out.println(t1.getTeamName() + " team average is " + t1.getTeamAverage());
        System.out.println(t1.getTeamName() + " team average is " + t2.getTeamAverage());
    }
}
