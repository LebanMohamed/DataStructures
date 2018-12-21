package StackAndQueues;

public class StackChar {
    // LIFO is useful for this, reversing strings
    private static int maxSize;
    private static char[] stackArray;
    private static int top;

    public StackChar(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    private void push(char pushedNumber) {
        top++;
        stackArray[top] = pushedNumber;
    }

    private char pop() {
        return stackArray[top--];
    }

    private boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }

    public static String reverseString(String str) {
        StackChar s = new StackChar(5);

        for (int i = 0; i < str.length(); i++)
            s.push(str.charAt(i));

        String returnString = "";
        while (!s.isEmpty()) {
            char c = s.pop();
            returnString = returnString + c;
        }
        return returnString;
    }

}
