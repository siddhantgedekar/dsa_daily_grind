import java.util.Queue;
import java.util.LinkedList;

public class Question5 {
    public static void interLeave (Queue<Integer> arr) {
        int mid = arr.size()/2;
        Queue<Integer> q = new LinkedList<>();

        // assign values
        int j = 0;
        for(int i=0;i<mid; i++){
            q.add(arr.remove());
        }
        while(!q.isEmpty()){
            arr.add(q.remove());
            arr.add(arr.remove());
        }
        System.out.println(arr);
    }

    public static void main(String [] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=10; i++){
            q.add(i);
        }
        interLeave(q);
    }
}