import java.rmi.activation.ActivationGroup_Stub;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamOptionalMainApp {
    public static void main(String[] args) {

        // Optional = typ opakowujący jakiś obiekt
        // Optional[Object]/Optional[]
        //Zabezpieczeni przed null'ami

        List<User> users = new ArrayList<>();
        users.add(new User("Bartek","Biały","bartek@test.com", 10));
        users.add(new User("Tomek","Czarny","tomek@test.com", 12));
        users.add(new User("Marcin","Niebieski","marcin@test.com", 13));
        users.add(new User("Jacek","Fioletowy","jacek@test.com", 14));
        users.add(new User("Asia","Biały","asia@test.com", 16));
        users.add(new User("Marta","Czerwona","marta@test.com", 17));
        users.add(new User("Kasia","Pomarańczowa","kasia@test.com",90));
        users.add(new User("Kasia","Pomarańczowa","kasia@test.com",90));
        users.add(new User("Kasia","Pomarańczowa","kasia@test.com",90));
        users.add(new User("Kasia","Pomarańczowa","kasia@test.com",90));

//        Metody dla Optional
//            1. get() - Jeżeli np zrobimy SystemOutPrintln(max.get)) a lista będzie pusta to rzuci wyjątkiem
//            2.isPresent() - zwraca boolean, mówi czy optional zawiera jakąś wartośc czy nie
//            3. isEmpty() - zwraca boolean, odpowiada na pytanie czy optional jest pusty czy nie
//            4.orElse()
//            5.orElseGet()
//            6.orElseThrow()
//            7.ifPresent()
//            8.ifPresentOrElse()



        Optional<User> max = users.stream()
                .max(Comparator.comparingInt(User::getUserAge));

        //System.out.println(max.get());

        if(max.isPresent()){
            System.out.println(max.get());
        }else{
            System.out.println("Element does not exist"); //zakomentować elementy listy
        }


        // sprawdzenie czy na liście userów jest chociażby 1 Kasia

        String kasia = users.stream()
                .map(User::getFirstname) // zawężanie streamu tylko do 1 imienia
                .filter(s -> s.equals("Kasia"))
                .findFirst()
                .orElse("Kasia does not exist");

        System.out.println(kasia); // gdy nie bedzie żadnej Kasi na liscie to dostaniemy "Kasia does not exist"
   
   // maksymalny wiek - drugi sposób
        Integer age = users.stream()
                .map(User::getAge)
                .max(Integer::compareTo)
                .orElse(-1);

        System.out.println(age);

        //Interfejs funkcyjny:
        // 1. Predicate - pobiera jedną wartość i zwraca boolean (np w filtrze)
        // 2. Consumer - pobiera jedną wartość i nic nie zwraca (np SOUT)
        // 3. Supplier - dostarcza wartość (orElseGet)

        //orElseGet

        User bartek = users.stream()
                .filter(user -> user.getFirstname().startsWith("B")) // filtrowanie userów zaczynających sie na literę B
                .findFirst() // jęzeli użytkownik na literę B będzie to zwracamy tego użytkownika
                .orElseGet(() -> new User("Bartek", "Testowy",
                                "b@test.pl", 18));// jeżeli nie będzie użytkownika na literę B to ta metoda utworzy/wygeneruje nam takeigo użytkownika

        System.out.println(bartek);// gdy na liscie jest Bartek jakiś to będzie wyświetlony pierwszy z listy, gdy nie ma to będzie wyświetlony ten z .orElseGet


        //orElseThrow


        User tomek = users.stream()
                .filter(user -> user.getFirstname().startsWith("T")) //filtrowanie userów zaczynających się na literę T
                .findFirst() // jęzeli użytkownik na literę T będzie to zwracamy tego użytkownika
                .orElseThrow(()-> new IllegalStateException("Na tej liście nie ma usera, którego imię zaczyna się na literę T")); //jeżeli nie ma go chcemy  rzucić wyjątek (nie chcemy rzucić żadnego nowej wartości)
        System.out.println(tomek);


        //ifPresent
         users.stream()
                 .filter(user -> user.getFirstname().startsWith("A"))
                 .findFirst()
                 .ifPresent(user-> System.out.println(user));

         //ifPresentOrElse
        users.stream()
                .filter(user -> user.getFirstname().startsWith("V"))
                .findFirst()
                .ifPresentOrElse(user-> System.out.println(user), ()-> System.out.println("Nie ma takiego usera"));

    }
}
