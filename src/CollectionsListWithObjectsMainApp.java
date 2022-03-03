import java.util.*;

public class CollectionsListWithObjectsMainApp {

    public static void main(String[] args) {


        List<User> users = new ArrayList<>();

        //Adding list elements by using constructor User
        users.add(new User("Bartek","Testowy","bk@test.com", 17));
        users.add(new User("Tomek","Testowy","bk@test.com", 27));
        users.add(new User("Marcin","Testowy","bk@test.com", 37));
        users.add(new User("Asia","Testowy","bk@test.com", 10));

        // SHOW ALL USERS

        for (User user : users){
            System.out.println(user.getFirstname());
        }

        //SORT BY NAME

        Collections.sort(users, Comparator.comparing(User::getFirstname));
        System.out.println(users);

        //SORT BY AGE

        Collections.sort(users, Comparator.comparingInt(User::getAge));
        System.out.println(users);
        for (User user : users){
            System.out.println(user.getFirstname() + " " + user.getAge());
        }

        //REVERTED SORTING BY AGE

        Collections.sort(users, Comparator.comparingInt(User::getAge).reversed());
        System.out.println(users);
        for (User user : users){
            System.out.println(user.getFirstname() + " " + user.getAge());
        }


    }
}