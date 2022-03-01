import java.util.ArrayList;
import java.util.List;

public class PackingTypeMainApp {
    public static void main(String[] args) {


        // Packing types
        Byte b;
        Short s;
        Integer i;
        Long l;
        Float f;
        Double d;
        Character c;
        Boolean bl;

        // Creating primitive types

        int number = 10;

        //Creating packing types

        Integer intNumber = 10;// change to reference type = auto boxing
        System.out.println(intNumber);

        int newNumber = intNumber.intValue();// change to primitive type = auto unboxing

        Double newDbl = 3.15;


        // Collection

        List<Integer> numbers = new ArrayList<>();


    }
}
