import java.io.*;
import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Comparators {
    static class Checker implements Comparator<Player> {
        public int compare(Player a, Player b) {
            if(a.score < b.score) {
                return 1;
            } else if (a.score > b.score) {
                return -1;
            } else {
                return a.name.compareTo(b.name);
            }
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Player[] players = new Player[n];
        
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            players[i] = new Player(name, score);
        }
        Arrays.sort(players, new Checker());
        
        for (Player p : players) {
            System.out.println(p.name + " " + p.score);
        }
    }
}
