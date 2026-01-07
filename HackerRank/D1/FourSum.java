import java.util.List;
import java.util.ArrayList;

public class FourSum {
    public static void result (List<Integer> arr) {
        int n = arr.size(), sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j != n-i-1) {
                    sum += arr.get(j);
                }
            }
            if(sum < min) min = sum;
            if(sum > max) max = sum;
            sum = 0;
        }
        System.out.println("Min: "+min+" Max: "+max);
    }
    public static void main(String [] args) {
        List<Integer> arr = List.of(1,2,3,4,5);
        result(arr);
    }
}