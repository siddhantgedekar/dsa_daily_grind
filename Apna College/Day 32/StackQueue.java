import java.util.*;

public class StackQueue {

    public static class Queue {
        Stack<Integer> real = new Stack<>();
        Stack<Integer> fake = new Stack<>();

        // approach 
        // add -> O(n) while remove and peek -> O(1);
        // our home work was reverse....
        // lets do it...
        public boolean isEmpty () {
            return real.empty();
        }

        public void add (int data) {
            // if(isEmpty()) {
            //     real.push(data);
            //     return;
            // }
            // while(!real.empty()) {
            //     fake.push(real.pop());
            // }
            // real.push(data);
            // while(!fake.empty()) {
            //     real.push(fake.pop());
            // }
            real.push(data);
        }

        public int remove () {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            while(!isEmpty()) {
                fake.push(real.pop());
            }
            int top = fake.pop();
            while(!fake.empty()) {
                real.push(fake.pop());
            }
            return top;
            // return real.pop();
        }

        public int peek () {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            while(!isEmpty()) {
                fake.push(real.pop());
            }
            int top = fake.peek();
            while(!fake.empty()) {
                real.push(fake.pop());
            }
            return top;
        }

    }

    public static void main(String [] args) {
        Queue a = new Queue();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        while(!a.isEmpty()) {
            System.out.println(a.remove());
        }
    }
}