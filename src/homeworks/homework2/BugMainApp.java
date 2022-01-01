package homeworks.homework2;

public class BugMainApp {
    public static void main(String[] args) {

        Bug one = new Bug("Login page does not work.", "monika@test.pl",2);
        one.allInfo();
        one.reporter();
        one.bugStatus();
        int priority = one.getBugPriority();
        System.out.println(priority);

        one.isOpen= false; // default bug status is true
        one.bugStatus();


    }
}
