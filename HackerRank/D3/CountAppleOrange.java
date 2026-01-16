import java.util.List;

public class CountAppleOrange {
    public static void solution (int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleCount = 0, orangeCount = 0; // counting variables
        
        if(a < s && s < t && t < b) {
            // not loop through arrays
            for(int i=0; i<apples.size(); i++) {
                int range = (apples.get(i) + a);
                if( range >= s && range <= t) {
                    appleCount++;
                }
            }
            for(int i=0; i<oranges.size(); i++) {
                int range = (oranges.get(i) + b);
                if(range <= t && range >= s) {
                    orangeCount++;
                }
            }
        }
        
        System.out.println(appleCount + "\n" + orangeCount);
    }
    public static void main(String [] args) {
        List<Integer> apples = List.of(-2,2,1);
        List<Integer> oranges = List.of(5,-6);
        solution(7, 11, 5, 15, apples, oranges);
    }
}