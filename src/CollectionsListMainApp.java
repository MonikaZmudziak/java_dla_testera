import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsListMainApp {

    public static void main(String[] args) {

        // Collection - set of elements of the same type -> element1, element2, element3


        List<String> names = new ArrayList<>();
        List<String> names1 = new ArrayList<>();

        // ADDING ELEMENTS
        names.add("Bartek"); // index 0
        names.add("Tomek");  // index 1
        names.add("Marcin"); // index 2
        names.add("Asia");   // index 3

        names1.add("Bartek");
        names1.add("Asia");



        // DISPLAYING ELEMENTS
        System.out.println(names);
//
//        for (String name: names){
//            System.out.println(name);
//        }


        // REMOVING ELEMENTS
//        names.remove(0);
//        System.out.println(names);
//
//        names.remove("Marcin");
//        System.out.println(names);


        String name = names.get(1);
        System.out.println(name);

        // SIZE
        System.out.println(names.size());
        // IS EMPTY
        names.isEmpty();
        // CONTAINS
        names.contains("Bartek");
        // ADD ANOTHER LIST
        names.addAll(names1);
        System.out.println(names);
        //REMOVE ANOTHER LIST
//        names.removeAll(names1);
//        System.out.println(names);


        // SORTING
        Collections.sort(names);
        System.out.println(names);

        //REVERTED SORTING
        Collections.reverse(names);
        System.out.println(names);
    }
}
