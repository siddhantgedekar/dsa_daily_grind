import java.io.*;
import java.util.*;

public class NegativeSubarr {
    public static void main(String [] args) {

        int[] arr = {1, -2, 4, -5, 1};

        int count = 0;
        int len = arr.length;
                
        // subarrays
        for(int i=0; i<len; i++) {
            int sum = 0;
            for(int j=i-1; j<len; j++) {
                sum += arr[j];
                if(sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}