package Queue;

public class Queue1 {

    static class Queue2 {  //Implement queue using array
        int arr[];
        int size;
        int rear;

        Queue2(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // Check if queue is empty
        public boolean isEmpty() {
            return rear == -1;
        }

        // Add element to the queue (enqueue) 
        public void add(int data) { // O(1)
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Remove element from the queue (dequeue)
        public int remove() { // O(n)
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];
            // shift elements to the left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // Peek front element
        public int peek() { // O(1)
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    static class Queue { //circular queue
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void add(int data) { //O(1)
            if(isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if(front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int remove() { 
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }


            int result = arr[front];
            if(rear == front) {
                rear = front = -1;
            }
            else {
                front = (front + 1) % size;
            }
            return result;
        }

        public int peek() {
            if(isEmpty()) {
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
