import java.util.Arrays;

public class Team {
    private String teamName;
    private Player[] players;

    // Constructors (default, parameterized, copy constructor);

    public Team() {
        this.teamName = "";
        this.players = new Player[5];
        for (int i = 0; i < this.players.length; i++) {
            this.players[i] = new Player("", new int[5]); // assuming Player has a default constructor
        }
    }

    public Team(String teamName, Player[] players) {
        this.teamName = teamName;
        this.players = new Player[players.length];
        for (int i = 0; i < this.players.length; i++) {
            this.players[i] = new Player(players[i]);
        }
    }

    public Team(Team source) {
        this.teamName = source.teamName;
        this.players = new Player[source.players.length];
        for (int i = 0; i < this.players.length; i++) {
            this.players[i] = new Player(source.players[i]);
        }
    }

    // getter and setters
    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player getPlayers(int index) {
        Player copy = new Player(this.players[index]);
        return copy;
    }

    public void setPlayers(int index, Player player) {
        Player copy = new Player(player);
        this.players[index] = copy;
    }

    // addPlayer(Player p)
    public void addPlayer(Player p) {
        Player[] copyPlayer = new Player[this.players.length];
        for (int i = 0; i < copyPlayer.length; i++) {
            copyPlayer[i] = new Player(this.players[i]);
        }
        copyPlayer = Arrays.copyOf(copyPlayer, copyPlayer.length + 1);
        copyPlayer[copyPlayer.length - 1] = new Player(p);
        this.players = copyPlayer;
    }

    // printTeam()
    public void printTeam() {
        System.out.print("\n");
        System.out.print(this.teamName + " Players");
        System.out.print("\n");
        for (int i = 0; i < this.players.length; i++) {

            System.out.print("\t" + this.players[i].getName() + Arrays.toString(this.players[i].getRuns()));
            System.out.print("\n");

        }
        System.out.println("\n=====================================================");
    }

    // getTeamAverage()
    public double getTeamAverage() {
        double playersTotal = 0;
        for (int i = 0; i < this.players.length; i++) {
            playersTotal += this.players[i].getAverageRuns();
        }

        double teamAvg = playersTotal / this.players.length;

        return teamAvg;
    }

}