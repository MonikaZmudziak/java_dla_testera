import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsSetMainApp {

    public static void main(String[] args) {

        // SET - only unique elements

        Set<String> names = new HashSet<>();

        names.add("Bartek");
        names.add("Marcin");
        names.add("Tomek");
        names.add("Jacek");
        names.add("Asia");
        names.add("Bartek");


        System.out.println(names.size()); // duplicates has been deleted
        /*
        for(String name: names){
            System.out.println(name);
        }*/

        //SORT ELEMENTS - unique and sorted elements
        Set<String> sortedNames = new TreeSet<>(names);

        for(String name: names){
            System.out.println(name);
        }


    }
}
