package java_ex;

public class JosephusSolution {

    CircularLinkedList cll = new CircularLinkedList();
    int total = 0;

    public JosephusSolution(int size) {
        for (int i = 0; i < size; i++) {
            cll.insert(i + 1);
        }
        total = size;
    }

    public void start(int hops) {
        cll.setMarkerPosition(1);
        while (total > 1) {
            for (int i = 1; i <= hops; i++) {
                cll.move();
            }
            cll.delete();
            --total;
        }
        System.out.println(cll.toString());
    }

}
