import java.util.List;
// get a matrix's diagonal difference
public class Diagonaldiff {
    public static int res (List<List<Integer>> matrix) {
        int[] sum = new int[2];
        int len = matrix.get(0).size()-1;
        for(int i=0; i<=len; i++) {
            sum[0] += matrix.get(i).get(i);
            sum[1] += matrix.get(len-i).get(i);
            System.out.println(sum[0]);
            System.out.println(sum[1]);
        }
        return Math.abs(sum[0]-sum[1]);
    }
    public static void main(String [] args) {
        List<List<Integer>> matrix = List.of(
            List.of(11, 2, 4),
            List.of(4, 5, 6),
            List.of(10, 8, -12)
        );
        // System.out.println(matrix.get(matrix.get(0).size() -1).get(0));
        int sum = res(matrix);
        System.out.println("Sum: "+sum);
    }
}