import java.util.*;

/**
 * Simple program to sort players by score (descending) then name (ascending).
 *
 * Input format (no prompts):
 * - First line: integer n, number of players
 * - Next n lines: each line contains a player's name (single token) and score (int)
 *
 * Output:
 * - n lines, each: "<name> <score>" in sorted order
 */
class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Comparators {
    /**
     * Comparator that orders by score descending, then name ascending.
     */
    static class Checker implements Comparator<Player> {
        @Override
        public int compare(Player a, Player b) {
            if (a.score != b.score) {
                return Integer.compare(b.score, a.score); // descending score
            }
            return a.name.compareTo(b.name); // ascending name
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            players[i] = new Player(name, score);
        }
        sc.close();

        Arrays.sort(players, new Checker());

        for (Player p : players) {
            System.out.println(p.name + " " + p.score);
        }
    }
}
