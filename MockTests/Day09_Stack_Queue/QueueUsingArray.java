public class QueueUsingArray {
    int[] queue = new int[5];
    int front = 0, rear = -1;

    void enqueue(int value) {
        if (rear == queue.length - 1) return;
        queue[++rear] = value;
    }

    int dequeue() {
        if (front > rear) return -1;
        return queue[front++];
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray();
        q.enqueue(10); q.enqueue(20); q.enqueue(30);
        System.out.println(q.dequeue());
    }
}
