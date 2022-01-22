import java.sql.SQLOutput;

public class UserMainApp {
    public static void main(String[] args) {

        // object type  object name = new object (class name) ();

        //User monika = new User();// creating an object by calling a constructor

        User monika = new User("Monika", "Test","monika@test.com",17);
        User bartek1 = new User("Bartek1", "Test", "bartek1@test.pl", 25);
        //System.out.println(bartek1.firstname);

        System.out.println(monika.getEmail());
        monika.setEmail("new@email.ru");
        System.out.println(monika.getEmail());

        System.out.println(User.userCounter); // dostęp do pola statycznego, dostajemy sie za pomocą nazwy klasy a nie nazwy referencji do obiektu
        System.out.println(User.getUserCounter());// static method

//        monika.firstname = "Monika";
//        monika.lastname = "Test";
//        monika.email = "monika@test.com";
//        monika.age = 17;
//        monika.isAdult = false;
//        monika.getFullName();
//
        monika.getAllInfo(); // the void method displays sth to the console
//
//        monika.getUserAge(); // this method display nothing, we should use System out println to display sth to the console
//        System.out.println(monika.getUserAge()); // displaying value
//
//        boolean userAdult = monika.isUserAdult();
//        System.out.println("Czy Monika jest dorosła:" + " " + userAdult);
//
//
//        int userAge = monika.getUserAge();// assigning a value to a variable
//
//
//        monika.greetings("Monika");
//        monika.greetings("Asia");
//        monika.howOldAreYou("Monika", 18);
//        int monikaAgePlus10 = monika.youAgePlusTen(17);
//        System.out.println(monikaAgePlus10);

//        monika.greetingsFullName("Monika", "Test");


        /* System.out.println(monika.firstname + " " + monika.lastname);
        System.out.println(monika.firstname + " " + monika.lastname + " " + monika.email + " " + monika.age + " " + monika.isAdult); */


        User tomek = new User("Tomek", "Brown", "tomek@test.com", 30);
//        tomek.firstname = "Tomek";
//        tomek.lastname = "Brown";
//        tomek.email = "tomek@test.com";
//        tomek.age = 30;
//        tomek.isAdult = true;
//        tomek.getFullName();
        tomek.getAllInfo();

//        boolean tomekUserAdult = tomek.isUserAdult();
//        System.out.println(tomekUserAdult);
//
//        /*System.out.println(tomek.firstname + " " + tomek.lastname + " " + tomek.email + " " + tomek.age + " " + tomek.isAdult);
//        System.out.println(tomek.firstname + " " + tomek.lastname);*/
//
//        int tomekAgePlus10 = tomek.youAgePlusTen(tomek.age);
//        System.out.println(tomekAgePlus10); // System.out.println(tomek.youAgePlusTen(tomek.age));
    }


}

