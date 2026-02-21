import java.util.List;

public class TallestCandle {
    public static int solution (List<Integer> candles) {
        int tallest = Integer.MIN_VALUE;
        int count = 1;
        // Find the tallest candle then count how many there are
        // we can do it in two ways...

        // first my original one.
        for(int candle : candles) {
            if(candle > tallest) tallest = candle;
        }
        // now count
        for(int candle : candles) {
            if(candle == tallest) count++; // very simple and basic approach
        }

        // 2nd approach - single pass
        /*
        for(int candle : candles) {
            if(candle > tallest) {
                tallest = candle;
                count = 1; // reset count, if the value of tallest candles changes
                // this gives us opportunity to find height of the next tallest candle
                // which was not present up until now.
            } else if(candle == tallest) {
                count++; // this means we found the same tallest candle again
            }
        }
        */
        return count;
    }
    public static void main(String [] args) {
        List<Integer> candles = List.of(3, 1, 2, 3);
        System.out.println(solution(candles));
    }
}