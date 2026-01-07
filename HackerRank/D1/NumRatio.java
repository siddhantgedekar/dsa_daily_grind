import java.util.List;
import java.util.ArrayList;

public class NumRatio {
    public static void findRatio (List<Integer> arr) {
        int pos = 0, neg = 0, zero = 0;
        for(int num : arr) {
            if(num > 0) {
                pos++;
            } else if(num < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        double len = arr.size();
        System.out.printf("%.6f%n",(pos/len));
        System.out.printf("%.6f%n",(neg/len));
        System.out.printf("%.6f%n",(zero/len));
    }
    public static void main(String [] args) {
        List<Integer> arr = List.of(-4, 3, -9, 0, 4, 1);
        findRatio(arr);
    }
}