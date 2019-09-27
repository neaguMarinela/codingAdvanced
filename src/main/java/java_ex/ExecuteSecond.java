package java_ex;

public class ExecuteSecond {
 
    public static void main(String[] args) {
        
        MyLinkedList mll = new MyLinkedList();
        
        mll.add("Oracle");
        mll.add("Microsoft");
        mll.add("Yahoo");
        mll.add("Google");
        mll.add("Dell");
        
        mll.remove("Yahoo");
        
        mll.displayLinkedList();
    }
}
