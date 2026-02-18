public class Q1TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // steps
        // compare sum of 1st element with the rest
        // if sum == target return the indices
        // else select next element, add it and compare the sum till we get the result
        // brute force method O(n^2) complexity
        int[] idx = new int[2];
        for (int i=0; i<nums.length-1; i++) {
            int el = nums[i];
            for(int j=i+1; j<nums.length; j++) {
                int next = nums[j];
                if((el + next) == target) {
                    idx[0] = i;
                    idx[1] = j;
                    break;
                }
            }
        }
        return idx;
    }
    public static void main(String [] args) {
        Print p = new Print();

        // nums = [2,7,11,15], target = 9
        int[] nums = {2,7,11,15};
        int target = 9;

        // call the function
        int[] res = twoSum(nums, 9);

        // calling method from another class

        System.out.print("Result: ");
        p.print(res);
    }
}