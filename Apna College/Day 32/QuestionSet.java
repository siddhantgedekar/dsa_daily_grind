import java.util.Deque;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QuestionSet {
    // generate binary number using queue data structure
    public static void genBinary (int n) {
        // Deque<Integer> q = new LinkedList<>();
        int binary = 0;
        // StringBuilder binary = new StringBuilder("");
        // for(int i=1; i<=num; i++){
        //     int temp = i;
        //     while(temp != 0) {
        //         binary = temp%2;
        //         q.addFirst(binary);
        //         temp /= 2;
        //     }
        //     // System.out.println(q);
        //     binary = 0;
        //     while(!q.isEmpty()){
        //         binary = (q.removeFirst() + binary * 10);
        //     }
        //     System.out.println(binary);
        // }
        // StringBuilder str = new StringBuilder("");

        // for(int i=1; i<=num; i++) {
        //     int temp = i;
        //     while(temp != 0) {
        //         str.append(temp%2);
        //         temp /= 2;
        //     }
        //     System.out.print(str.reverse());
        //     str.setLength(0);
        //     System.out.println();
        // }

        Queue<String> q = new LinkedList<String>();
        q.add("1");
        while (n-- > 0) {
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
        // System.out.println(q);
    }

    // minimum cost of ropes
    public static int minCost (int arr[], int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i=0; i<n; i++) {
            pq.add(arr[i]);
        }

        int res = 0;
        while(pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            res += (first + second);
            pq.add(first + second);
        }
        return res;
    }

    // reversing first k elements of a queue
    public static void reverseFirstHalf (Queue<Integer> q, int k) {
        Stack<Integer> temp = new Stack<>();

        for(int i=0; i<k; i++) {
            temp.push(q.remove());
        }
        for(int i=0; i<k; i++) {
             q.add(temp.pop());
        }
        for(int i=0; i<k; i++) {
            int n = q.remove();
            q.add(n);
        }
        System.out.println(q);
    }

    // maximum of sum of subarrays
    public static Queue subMax (int arr[], int k) {
        int max = 0;
        Queue<Integer> q = new LinkedList<>();
        
        // interate
        for(int i=0; i<=arr.length-k; i++) {
            for(int j=i; j<(i+k); j++) {
                if(max < arr[j]) {
                    max = arr[j];
                }
            }
            q.add(max);
            max = 0;
        }

        return q;
    }

    public static void main(String [] args) {
        int k = 5;
        // int arr[] = {1,2,3,1,4,5,2,3,6};
        genBinary(k);
        // min cost of ropes
        int arr[] = {4, 3, 2, 6};
        int size = arr.length;
        System.out.println("Total cost is: " + minCost(arr, size));
        // Queue<Integer> q = new LinkedList<>();
        // reverseFirstHalf(q, 5);
        // System.out.println(subMax(arr, k));
    }
}