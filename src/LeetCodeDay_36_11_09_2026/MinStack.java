package LeetCodeDay_36_11_09_2026;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> st;
    private Stack<Integer> min;

    // Constructor
    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    // Push element
    public void push(int val) {

        System.out.println("\nCalling push(" + val + ")");

        // If stack is empty OR val is smaller/equal to current minimum
        if (st.size() == 0 || min.peek() >= val) {
            min.push(val);
            System.out.println("Added to Min Stack: " + val);
        }

        st.push(val);

        System.out.println("Actual Stack = " + st);
        System.out.println("Min Stack    = " + min);
    }

    // Remove top element
    public void pop() {

        System.out.println("\nCalling pop()");

        int ele1 = st.pop();
        int ele2 = min.peek();

        System.out.println("Removed from Actual Stack = " + ele1);
        System.out.println("Current Minimum = " + ele2);

        if (ele1 == ele2) {
            min.pop();
            System.out.println("Removed from Min Stack = " + ele2);
        }

        System.out.println("Actual Stack = " + st);
        System.out.println("Min Stack    = " + min);
    }

    // Return top element
    public int top() {
        return st.peek();
    }

    // Return minimum element
    public int getMin() {
        return min.peek();
    }

    // Main method - required to run in STS
    public static void main(String[] args) {

        MinStack obj = new MinStack();

        obj.push(5);
        obj.push(3);
        obj.push(7);
        obj.push(2);

        System.out.println("\n--------------------");
        System.out.println("Top Element = " + obj.top());
        System.out.println("Minimum     = " + obj.getMin());

        obj.pop();

        System.out.println("\nAfter pop:");
        System.out.println("Top Element = " + obj.top());
        System.out.println("Minimum     = " + obj.getMin());

        obj.pop();

        System.out.println("\nAfter second pop:");
        System.out.println("Top Element = " + obj.top());
        System.out.println("Minimum     = " + obj.getMin());
    }
}