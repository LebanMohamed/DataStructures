package StackAndQueues;

public class Stack {
    // -> Last In First Out
    // Used to reverse a word
    // Used to `undo` stuff

    private static int maxSize;
    private static long[] stackArray;
    private static int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    // Adds pushedNumber into the array
    private void push(long pushedNumber) {
        top++;
        stackArray[top] = pushedNumber;
    }

    // Removes the last number
    private long pop() {
        return stackArray[top--];
    }

    // Returns the top number
    private long peak() {
        return stackArray[top];
    }

    // Check if array is empty
    private boolean isEmpty() {
        return (top == -1);
    }

    // Check if array is full
    private boolean isFull() {
        return (maxSize - 1 == 2);
    }

    public String toString() {
        return "Size: " + maxSize + "\nTop: " + peak();
    }

    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            long value = s.pop();
            System.out.println(value);
        }
    }

}
