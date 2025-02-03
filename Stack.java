class Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public Stack(int size) {
        stackArray = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed: " + value);
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! No element to pop.");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty! No element to peek.");
            return -1;
        }
        return stackArray[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70); 

        System.out.println("Peek: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
    }
}
