import java.util.ArrayList;
import java.util.List;

public class Verybigsum {
    public static long bigSum (List<Long> a) {
        long sum = 0;
        for(long i : a) {
            sum += i;
        }
        return sum;
    }
    public static void main(String [] args) {
        List<Long> a = List.of(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L);
        long res = bigSum(a);
        System.out.println("Sum of long numbers is: " + res);
    }
}