package java_ex;

public class LinkedList {
    
    private Node first = null;
    
    public void insertFirst(int data) {
    
        Node n = new Node(data);
        n.next = first;
        first = n;        
    }
    
    public Node deleteFirst() {
    
        Node temp = first;
        first = first.next;
        return temp;
        
    }
    
    public void displayList() {
    
        Node current = first;
        
        while ( current != null) {
        
            current.displayNode();
            current = current.next;
        }
    }
    
    public boolean isEmpty() {
    
        return (first == null);
    }
    
    private class Node {
    
        int data = 0;
        Node next;
        
        Node (int data) {
        
            this.data = data;
        }
        
        void displayNode() {
        
            System.out.println( data );
        }        
    }
}
