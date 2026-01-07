import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    public static List<Integer> result (List<Integer> a, List<Integer> b) {
        List<Integer> res = new ArrayList<>();
        res.add(0); // a's score
        res.add(0); // b's score
        // List.of(0,0); create an immutable list, hence ArrayList is needed
        for(int i=0; i<a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                res.set(0, res.get(0) + 1);
            } else if (a.get(i) < b.get(i)) {
                res.set(1, res.get(1) + 1);
            }
        }
        return res;
    }
    public static void main(String [] args) {
        List<Integer> a = List.of(5, 6, 7);
        List<Integer> b = List.of(3, 6, 10);
        List<Integer> res = result(a, b);
        System.out.println("Result of ratings of a and b is: " + res.get(0) + " " + res.get(1));
    }
}