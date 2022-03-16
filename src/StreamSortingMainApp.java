import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingMainApp {
    public static void main(String[] args) {


        List<User> users = new ArrayList<>();

        users.add(new User("Bartek","Biały","bartek@test.com", 10));
        users.add(new User("Tomek","Czarny","tomek@test.com", 12));
        users.add(new User("Marcin","Niebieski","marcin@test.com", 13));
        users.add(new User("Jacek","Fioletowy","jacek@test.com", 14));
        users.add(new User("Asia","Biały","asia@test.com", 16));
        users.add(new User("Asia","Biały","asia@test.com", 11));
        users.add(new User("Marta","Czerwona","marta@test.com", 17));
        users.add(new User("Kasia","Pomarańczowa","kasia@test.com", 18));

        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparing(User::getFirstname).thenComparing(User::getLastname).thenComparing(User::getAge)) // or .sorted(Comparator.comparing(user -> user.getFirstname()))
                // pierwsze sortujemy po imieniu, potem po naziwsku, potem po wieku
                .collect(Collectors.toList());


//       users.stream()
//                .sorted(Comparator.comparing(User::getFirstname)) // or .sorted(Comparator.comparing(user -> user.getFirstname()))
//                .forEach(System.out::println) // or forEach(user-> System.out.println(user));




        for (User user:sortedUsers){
            System.out.println(user.getFirstname() + " " + user.getLastname() + " " +user.getAge());
        }


    }
}
