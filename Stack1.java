import java.util.Scanner;

class Stack1 {
    private int[] stackArray;
    private int top;
    private int capacity;

    public Stack1(int size) {
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
            
        }
        return stackArray[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty! No element to peek.");
        }
        return stackArray[top];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack1 stack = new Stack1(5);

        while (true) {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped: " + poppedValue);
                    }
                    break;

                case 3:
                    int peekValue = stack.peek();
                    if (peekValue != -1) {
                        System.out.println("Peek: " + peekValue);
                    }
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
