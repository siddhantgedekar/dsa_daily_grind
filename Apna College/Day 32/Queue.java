public class Queue {
    
    public static class QueueA {
        static int arr[];
        static int size;
        static int rear;

        QueueA(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty () {
            return rear == -1;
        }

        // add
        public static void add (int data) {
            if(rear == size - 1) {
                System.out.println("Queue is full");
                return ;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        // remove
        public static int remove () {
            if(isEmpty()){
                System.out.println("List is empty");
                return -1;
            }

            int front = arr[0];
            for(int i=0; i<rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        // peek
        public static int peek () {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }
    }

    public static class QueueB {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        QueueB (int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty () {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear+1)%size == front;
        }

        public static void add (int data) {
            if(isFull()){
                System.out.println("Full");
                return ;
            }

            if(front == -1) {
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public static int remove () {
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }

            int result = arr[front];

            if(rear == front) {
                rear = front = -1;
            } else {
                front = (front+1) % size;
            }
            return result;
        }

        public static int peek () {
            if( isEmpty() ) {
                System.out.println("Empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String [] args) {
        QueueA q = new QueueA(5);
        QueueB b = new QueueB(5);

        q.add(1);
        q.add(2);
        q.add(3);

        b.add(1);
        b.add(2);
        b.add(3);

        System.out.println("*** Queue ***");
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

        System.out.println("*** Circular Queue ***");

        while(!b.isEmpty()) {
            System.out.println(b.peek());
            b.remove();
        }
    }
}