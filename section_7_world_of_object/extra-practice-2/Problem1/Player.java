import java.util.Arrays;

public class Player {
    private String name;
    private String team;
    private int[] runs;

    public Player() {
        this.name = "";
        this.team = "";
        this.runs = new int[5]; // default 5 innings with 0 runs
    }

    public Player(String name, String team, int[] runs) {
        setName(name);
        setRuns(runs);
        this.team = team;
    }

    public Player(Player source, boolean shallow) {
        this.name = source.name;
        this.team = source.team;
        if (shallow) {
            this.runs = source.runs;
        } else {
            this.runs = Arrays.copyOf(source.runs, source.runs.length);
        }
    }

    public String getName() {
        return this.name;
    }

    public String getTeam() {
        return this.team;
    }

    public int[] getRuns() {
        int[] runsCopy = Arrays.copyOf(this.runs, this.runs.length);
        return runsCopy;
    }

    public void setName(String name) {
        String[] words = name.split(" ");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            capitalized.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        this.name = capitalized.toString();
    }

    public void setRuns(int[] runs) {

        if (runs == null) {
            System.err.println("Runs cannot be null");
            System.exit(0);
        }
        for (int i = 0; i < runs.length; i++) {
            if (runs[i] < 0) {
                System.err.println("Run cannot be negative");
                System.exit(0);
            }
        }

        this.runs = Arrays.copyOf(runs, runs.length);
    }

    public double getAverageRuns() {
        double totalRuns = 0;
        for (int i = 0; i < runs.length; i++) {
            totalRuns += runs[i];
        }
        double avg = totalRuns / runs.length;

        return avg;
    }

    public void printPlayer() {
        System.out.println("\n====================================================");
        System.out.println("\n Name : " + getName());
        System.out.println("\n Team : " + getTeam());
        System.out.println("\n Runs (last 5 innings) : " + Arrays.toString(getRuns()));
        System.out.println("\n Average : " + getAverageRuns());
    }

    public String toString() {
        return "{" +
                "\n name ='" + getName() + "'" +
                ",\n team ='" + this.team + "'" +
                "," + //
                "\n runs ='" + Arrays.toString(getRuns()) + "'" +
                "\n}";
    }

}