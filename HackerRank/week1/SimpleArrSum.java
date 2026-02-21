import java.util.List;

public class SimpleArrSum {
    public static int arrSum (List<Integer> arr) {
        int sum = 0;
        for(int i=0; i<arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }
    public static void main(String [] args) {
        List<Integer> arr = List.of(1,2,3,4,5,6,7,8);
        System.out.println("Sum of array elements is: " + arrSum(arr));
    }
}