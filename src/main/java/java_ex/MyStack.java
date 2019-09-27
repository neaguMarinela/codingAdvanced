package java_ex;

public class MyStack {

    LinkedList link = new LinkedList();

    public void push(int data) {
        link.insertFirst(data);
    }

    public void pop() {
        link.deleteFirst();
    }

    public void displayStack() {

        link.displayList();
    }

    public static void main(String[] args) {

        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.displayStack();
        System.out.println("---------------");
        stack.pop();
        stack.pop();

        stack.displayStack();
    }
}

