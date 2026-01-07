import java.util.List;
import java.util.ArrayList;

public class FourSum {
    public static void result (List<Integer> arr) {
        // in the previous solution of O(n2) i was beaten by the constraints..
        long sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // find max and min element
        for(int num : arr) {
            sum += num;
            if(num < min) min = num;
            if(num > max) max = num;
        }
        System.out.println("Min: "+(sum - max)+" Max: "+(sum - min));
    }
    public static void main(String [] args) {
        List<Integer> arr = List.of(256741038,623958417,467905213,714532089,938071625);
        result(arr);
    }
}