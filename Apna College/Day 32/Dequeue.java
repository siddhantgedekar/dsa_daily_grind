import java.util.*;

public class Dequeue {
    public static void main(String [] args) {
        Deque<Integer> deque = new LinkedList<>();

        for(int i=1; i<=10; i++){
            deque.addFirst(i);
        }
        deque.removeFirst();

        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
    }
}