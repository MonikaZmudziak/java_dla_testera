import java.rmi.activation.ActivationGroup_Stub;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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


    }
}
