import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsSetWithObjectsMainApp {

    public static void main(String[] args) {

        Set<User> users = new HashSet<>();
        users.add(new User("Bartek","Testowy","bk@test.com", 11));
        users.add(new User("Bartek","Testowy","bk@test.com", 11)); // duplicate
        users.add(new User("Tomek","Testowy3","bk@test.com", 11));
        users.add(new User("Asia","Testowy4","bk@test.com", 11));
        users.add(new User("Asia","Testowy6","bk@test.com", 11));
        users.add(new User("Asia","Testowy7","bk@test.com", 11));


        System.out.println(users.size());// the equals and hashCode methods in User class shouldn't be commented to show unique elements

        for (User user: users){
            System.out.println(user.getFirstname() + " " + user.getLastname());
        };

        //Sorted users - need interface Comparable in User class
        Set<User> sortedUser = new TreeSet<>(users);

        for (User user: users){
            System.out.println(user.getFirstname() + " " + user.getLastname());
        };





    }
}


