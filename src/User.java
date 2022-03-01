import com.sun.source.tree.ClassTree;

import java.util.Objects;

public class User {

    //object fields = description of what data the object will consist of
    // methods = what the object will be able to do



    public static int userCounter =0;  // pole statyczne należace do klasy a nie do obiektu
    private static int userCounterTwo=0;

    private String firstname; //default value = null
    private String lastname;
    private String email;
    private int age; // default value =0
    private boolean isAdult; // default value = false

    // Constructor - is using to creating new objects

//    User() { //constructor,name must be the same as a class name
//
//    }

    User(String firstname, String lastname, String email, int age) { // constructor overloading


        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
        //this.isAdult = isAdult;
        this.isAdult = isUserAdult();

//        boolean isUserAdult() {
//            if (age >= 18) {
//                this.isAdult = true;
//            } else {
//                this.isAdult = false;
//            }
//        }


        System.out.println(firstname + " " + lastname + " " + email + " " + age + " " + isAdult);

        userCounter++;
        userCounterTwo++;
    }

    // Getters and Setters
    public void setEmail(String email) { // set a private filed
        if (email.endsWith(".ru")) {
            System.out.println("RU emails ar not allowed!");
        } else {
            this.email = email;
        }


    }

    public String getEmail() { //read a private field, we can add validation
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    // return type + method name
    void getFullName() {
        System.out.println(firstname + " " + lastname);
    }

    void getAllInfo() {
        System.out.println(firstname + " " + lastname + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    void greetings(String name) {
        System.out.println("Hi " + name + ". Niece to see you!");

    }


    void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + " you are " + userAge + " old");

    }

    int youAgePlusTen(int userAge) {
        return userAge + 10;
    }


//    void greetingsFullName (String firstname, String lastname ) {
//        System.out.println("Hi " + firstname +" " + lastname + ". Niece to see you!");
//}

    void greetings(String firstName, String lastname) {   //method overloading is that we create methods with exactly the same names, but they must have different parameters: the number of parameters or the types of assumed parameters
        System.out.println("Hi " + firstname + " " + lastname + ". Niece to see you!");


    }


        public static int getUserCounter(){  //static method
            return userCounterTwo;



    }

    // toString, equals and hashCode methods


    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && isAdult == user.isAdult && Objects.equals(firstname, user.firstname) && Objects.equals(lastname, user.lastname) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, email, age, isAdult);
    }
}
