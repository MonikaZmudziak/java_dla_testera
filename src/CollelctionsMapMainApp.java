import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollelctionsMapMainApp {
    public static void main(String[] args) {


        // MAP = key + value
        // key should be unique, duplicate key will be overwritten with the new value


        Map<Integer, String> names= new HashMap<>();

        names.put(1, "Bartek1");
        names.put(10, "Bartek10");
        names.put(20, "Bartek20");
        names.put(0, "Bartek0");
        names.put(5, "Bartek5");
        names.put(20, "Bartek222");


        // sort asc
        Map<Integer, String> sortedNames = new TreeMap<>(names);
        System.out.println(sortedNames);

        // sort according to the orders in which items were added
        //psvm...
//        Map<Integer, String> names= new LinkedHashMap<>();
//
//        names.put(1, "Bartek1");
//        names.put(10, "Bartek10");
//        names.put(20, "Bartek20");
//        names.put(0, "Bartek0");
//        names.put(5, "Bartek5");
//        names.put(20, "Bartek222");
//        System.out.println(names);


        //displaying elements with map in loop

        for(Map.Entry<Integer, String> entry: names.entrySet()
        ){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
