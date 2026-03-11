import java.util.*;

public class MatrixSum {
    public static void main(String [] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(List.of(1,1,1,0,0,0));
        arr.add(List.of(0,1,0,0,0,0));
        arr.add(List.of(1,1,1,0,0,0));
        arr.add(List.of(0,9,2,-4,-4,0));
        arr.add(List.of(0,0,0,-2,0,0));
        arr.add(List.of(0,0,1,-2,-4,0));

        List<Integer> result = new ArrayList<>();
        
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=4; j++) {
                // mid
                int mid = arr.get(i).get(j);
                
                // top
                int t1 = arr.get(i-1).get(j-1);
                int t2 = arr.get(i-1).get(j);
                int t3 = arr.get(i-1).get(j+1);
                
                // bottom
                int b1 = arr.get(i+1).get(j-1);
                int b2 = arr.get(i+1).get(j);
                int b3 = arr.get(i+1).get(j+1);
                
                // sum
                int sum = t1+t2+t3+mid+b1+b2+b3;
                
                result.add(sum);
            }
        }
        
        int res = Collections.max(result);
        System.out.println(res);
    }
}