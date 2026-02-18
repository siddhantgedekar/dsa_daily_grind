import java.util.Deque;
import java.util.LinkedList;

public class StackByQueue {

    static class Stack {
        Deque<Integer> q = new LinkedList<>();
        public void push (int data) {
            q.addLast(data);
        }

        public int pop () {
            return q.removeLast();
        }

        public int peek () {
            return q.getLast();
        }

        public void print () {
            System.out.println(q);
        }
    }

    static class Queue {
        Deque<Integer> q = new LinkedList<>();

        public void add (int data) {
            q.addLast(data);
        }

        public int remove () {
            return q.removeFirst();
        }

        public int peek () {
            return q.getFirst();
        }

        public void print () {
            System.out.println(q);
        }
    }

    public static void main(String [] args) {
        Stack s = new Stack();
        Queue q = new Queue();

        for(int i=1; i<=10; i++) {
            s.push(i);
            q.add(i);
        }
        System.out.println("Peek = " + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.print();

        System.out.println("***** queue operation *****");
        System.out.println("Peek = "+q.peek());
        System.out.println("remove = "+q.remove());
        System.out.println("remove = "+q.remove());
        System.out.println("remove = "+q.remove());
        q.print();
    }
}