public class StackUsingArray {
    int[] stack = new int[5];
    int top = -1;

    void push(int value) {
        if (top == stack.length - 1) return;
        stack[++top] = value;
    }

    int pop() {
        if (top == -1) return -1;
        return stack[top--];
    }

    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray();
        s.push(10); s.push(20); s.push(30);
        System.out.println(s.pop());
    }
}
