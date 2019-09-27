package java_ex;

public class ExecuteList {
    
    public static void main(String[] args) {
        
        MyList list = new MyList();
        
        list.add("Item-1");
        list.add("Item-2");
        list.add("Item-3");
        list.add("Item-4");
        list.add("Item-5");
        list.add("Item-6");
        list.add("Item-7");
        list.add("Item-8");
        list.add("Item-9");
        list.add("Item-10");
        list.add("Item-11");
        list.add("Item-12");
        
        list.remove("Item-9");
        
        for(int i= 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
