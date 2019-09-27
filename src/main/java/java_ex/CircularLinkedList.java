package java_ex;

public class CircularLinkedList {

    private ListItem marker;
    private ListItem previous;
    private ListItem head;
    int size = 0;

    CircularLinkedList() {
        marker = null;
    }

    public void insert(Object x) {
        if (isEmpty()) {
            //  why can't the following two lines be done at the same time.?
            marker = new ListItem(x, null);
            head = marker;
            marker.setNext(marker);
        } else {
            //ListItem item = new ListItem(x, marker.getNext());
            ListItem item = new ListItem(x, null);
            marker.setNext(item);
            item.setNext(head);
            marker = item;

        }
        ++size;
    }

    public Object delete() {
        if (isEmpty())
            return null;
        else {
            Object temp = marker.getItem();
            previous.setNext(marker.getNext());
            marker = marker.getNext();
            --size;
            return temp;
        }

    }

    public Object head() {
        if (isEmpty())
            return null;
        else
            return marker.getNext().getItem();
    }

    public void move() {
        if (marker != null) {
            previous = marker;
            marker = marker.getNext();
        }
    }

    public boolean isEmpty() {
        return (marker == null);
    }

    public String toString() {
        String result;
        if (isEmpty())
            result = "empty list";
        else {
            ListItem head = marker.getNext();
            marker.setNext(null);  // break the cycle
            result = head.toString();
            marker.setNext(head);  // put the cycle back
        }
        return result;
    }

    public void setMarkerPosition(Object item) {

        if (marker.getItem().toString().equals(item.toString()))
            return;
        else {
            while (!marker.getItem().toString().equals(item.toString())) {
                marker = marker.getNext();
            }
        }
    }

    public String getDataOfCurrentPosition() {
        return marker.getItem().toString();
    }

    public int size() {
        return size;
    }

    // ===== ListItem class ====

    private class ListItem {
        private Object item;
        private ListItem next;

        ListItem(Object item, ListItem next) {
            this.item = item;
            this.next = next;
        }

        public void setNext(ListItem next) {
            this.next = next;
        }

        public ListItem getNext() {
            return next;
        }

        public void setItem(Object item) {
            this.item = item;
        }

        public Object getItem() {
            return item;
        }

        public String toString() {
            if (this.next == null)
                return item.toString();
            else
                return item.toString() + " " + next.toString();
        }
    }

}
