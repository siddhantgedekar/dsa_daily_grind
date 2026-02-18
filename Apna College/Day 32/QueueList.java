public class QueueList {
    public static class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        public static Node head = null;
        public static Node tail = null;

        public static boolean isEmpty () {
            return head == null & tail == null;
        }

        public static void add (int data) {
            Node newNode = new Node(data);

            if(head == null) {
                head = tail = newNode;
                return ;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static int remove () {
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            int front = head.data;
            if(tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        public static int peek () {
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return head.data;
        }
    }


    public static void main(String [] args) {
        Queue a = new Queue();
        
        a.add(1);
        a.add(2);
        a.add(3);

        while(!a.isEmpty()) {
            System.out.println(a.peek());
            a.remove();
        }

    }
}