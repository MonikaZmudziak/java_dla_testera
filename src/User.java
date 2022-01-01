import com.sun.source.tree.ClassTree;

public class User {

    //object fields = description of what data the object will consist of
    // methods = what the object will be able to do

    String firstname; //default value = null
    String lastname;
    String email;
    int age; // default value =0
    boolean isAdult; // default value = false

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
        this.isAdult=isUserAdult();

//        boolean isUserAdult() {
//            if (age >= 18) {
//                this.isAdult = true;
//            } else {
//                this.isAdult = false;
//            }
//        }

        System.out.println(firstname + " " + lastname + " " + email + " " + age + " "+ isAdult);
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


}