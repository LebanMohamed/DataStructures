package StackAndQueues;

public class Queue {
    // First In First Out
    // Used in call centers waiting to answer calls
    // Used in printing system

    private static int maxSize;
    private static long[] queArray;
    private static int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    private void insert(long n) {
		/*if (rear == maxSize - 1) { // circular queue, once your queue is filled up,
		 *you can override it with new elements
			rear = -1;
		}*/
        rear++;
        queArray[rear] = n;
        nItems++;
    }

    private long remove() {
        nItems--;
        if (front == maxSize)
            front = 0;
        return queArray[front++];
    }

    private boolean isEmpty() {
        return (nItems == 0);
    }

    private long peakFront() {
        return queArray[front];
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.insert(1);
        q.insert(2);
        q.insert(3);

        while (!q.isEmpty()) {
            long value = q.remove();
            System.out.println(value);
        }
    }

}
