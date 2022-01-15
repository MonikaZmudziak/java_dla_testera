import com.sun.security.jgss.GSSUtil;

import java.util.Locale;

public class ArraysMainApp1 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        System.out.println("Długość tablicy: " + numbers.length);


        //drugi sposób, gdy znamy wartości indexów tablicy
        int[] newNumbers = {1,2,3,4,5};


        String[] names = {"Bartek", "Marcin", "Michal","Tomek"};
        System.out.println("Długość tablicy: " + names.length);


        // foreach
        for (String name : names) {
            System.out.println(name.toUpperCase());
        }

        // for

        for( int i=0; i<names.length; i++){
            System.out.println(names[i].toLowerCase());

        }


        //zwiększenie wartości o 1
        int number =10;
        number= number+ 1;
        System.out.println(number);

        number+=1;
        System.out.println(number);


        // post increment  - zwiększanie wartości po użyciu zmiennej
        int numberTwo =10;
        System.out.println(numberTwo++);
        System.out.println(numberTwo);

        // pre increment - zwiększanie wartości przed użyciem zmiennej
        int numberThree=10;
        System.out.println(++numberThree);
        System.out.println(numberThree);
    }
}
