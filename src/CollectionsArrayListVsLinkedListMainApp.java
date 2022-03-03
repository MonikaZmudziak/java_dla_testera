import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsArrayListVsLinkedListMainApp {

    public static void main(String[] args) {


        // ArrayList
        //[element1, element2, element3] -- new element = index 3
        //[0            1           2
        //
        // LinkedList
        // [element1 <-> element2 <-> element3]

        List<String> names1 = new ArrayList<>();
        List<String> names2 = new LinkedList<>();

        names1.add("Bartek");
        names2.add("Bartek");

        names1.get(0);
        names2.get(0);

        names1.remove(0);
        names2.remove(0);





    }


}
