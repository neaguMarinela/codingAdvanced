package sortedMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
 
public class App {
 
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        System.out.println("********linkedHashMap********");
        //remain in added order
        testMap(linkedHashMap);
        System.out.println("******treeMap**********");
        //Keys sorted in natural order
        testMap(treeMap);
        System.out.println("*******hashMap*********");
        //Keys not in any particular order
        testMap(hashMap);
    }
     
    public static void testMap(Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(4, "cat");
        map.put(8, "dog");
        map.put(1, "giraffe");
        map.put(0, "swan");
        map.put(15, "bear");
        map.put(6, "snake");
         
        for(Integer key: map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
     
}