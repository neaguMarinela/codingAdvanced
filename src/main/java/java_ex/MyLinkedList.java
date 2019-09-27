package java_ex;

public class MyLinkedList {

    private Node head;
    private int size;

    public MyLinkedList() {

        head = new Node("Head Node");
        size = 0;
    }

    public void add(String data) {

        Node newNode = new Node(data);
        Node current = head;

        while (current.getNext() != null) {

            current = current.getNext();
        }

        current.setNext(newNode);
        ++size;
    }

    public void remove(String data) {

        Node current = head;

        while (current.getNext() != null) {

            if (current.getNext().getData().equalsIgnoreCase(data)) {

                Node nodeToRemove = current.getNext();

                current.setNext(current.getNext().getNext());

                nodeToRemove.setNext(null);
                nodeToRemove = null;

                --size;
                return;
            }

            current = current.getNext();
        }
    }

    public void add(String data, int position) {

        Node newNode = new Node(data);
        Node current = head;
        int counter = 0;

        while (current.getNext() != null) {

            if (counter == position - 1) {

                newNode.setNext(current.getNext());
                current.setNext(newNode);
                return;

            }
            current = current.getNext();
            counter++;

        }
    }

    public void displayLinkedList() {

        Node current = head;
        while (current != null) {

            System.out.println(current.getData());
            current = current.getNext();
        }

    }

    private class Node {

        private Node next;
        private String data;

        public Node(String data) {
            next = null;
            this.data = data;
        }


        /**
         * @return the next
         */
        public Node getNext() {
            return next;
        }

        /**
         * @param next the next to set
         */
        public void setNext(Node next) {
            this.next = next;
        }

        /**
         * @return the data
         */
        public String getData() {
            return data;
        }

        /**
         * @param data the data to set
         */
        public void setData(String data) {
            this.data = data;
        }


    }
}
