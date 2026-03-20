import java.util.*;

public class Hashset {
    public static void main(String [] args) {
        String[] arr = "john tom,john mary,john tom,mary anna,mary anna".split(",");

        Set<String> set = new HashSet<>();

        // alternate approach, where hacker rank bugged
        // String[] pair_left = new String[arr.length];
        // String[] pair_right = new String[arr.length];

        // for(int i=0; i<arr.length; i++) {
        //     String[] name = arr[i].split(" ");
        //     pair_left[i] = name[0];
        //     pair_right[i] = name[1];
        // }

        // for(int i=0; i<arr.length; i++) {
        //     String name = (pair_left[i].compareTo(pair_right[i]) <= 0) ? (pair_left[i] + " " + pair_right[i]) : (pair_right[i] + " " + pair_left[i]);

        //     set.add(name);
        //     System.out.println(set.size());
        // }

        // Simple approach
        for(String name : arr) {
            set.add(name);
            System.out.println(set.size());
        }
    }
}