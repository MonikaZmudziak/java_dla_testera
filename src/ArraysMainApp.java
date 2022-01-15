public class ArraysMainApp {
    public static void main(String[] args) {

        // int[] numbers = new int[10];


        String[] names = new String[5];

        // array values ["Bartek","Marcin","Asia","Monika","Tomek"]
        // array index  [   0,       1,       2,     3,        4  ]


        names[0] = "Bartek";
        names[1] = "Marcin";
        names[2] = "Asia";
        names[3] = "Monika";
        names[4] = "Tomek";


/*      System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
 */


        //for(licznik; warunek; zmiana licznika w góre lub w dół)// w tej pętli musimy znac index tablicy, tu możemy przeskakiwać wartości

        for (int i = 0; i < names.length; i++) {

            System.out.println(names[i]);
        }

        // wyświetlanie co drugiej wartości, tylko wyświetlone elementy ktore są na indexach parzystych
        for (int i = 0; i < names.length; i++) {
            if (i % 2 == 0) {
                System.out.println(names[i]);
            }
        }

        //wyświetlenie elementów nieparzystych
        for (int i = 0; i < names.length; i++) {
            if (i % 2 != 0) {
                System.out.println(names[i]);
            }
        }


        // foreach - (jakie el. będziemy pobierać z naszej tablicy,// tutaj przechodzimy przez wszytkie el tablicy
        for (String name : names) {
            System.out.println(name);

        }


    }
}