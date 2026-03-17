public class ArrList2 {
    public static boolean canWin (int leap, int[] game, int i) {
        if(i >= game.length)
            return true;

        if(i < 0 || game[i] == 1)
            return false;

        game[i] = 1; // mark visited

        return canWin(leap, game, i + leap) ||
            canWin(leap, game, i + 1) ||
            canWin(leap, game, i - 1);
    }

    public static void main(String [] args) {
        int leap = 3;
        int[] game = {0, 0, 0, 0, 0, 0};

        System.out.println(canWin(leap, game, 0) ? "YES" : "NO");
    }
}