package homeworks.homework2and3;

import homeworks.homework3model.Bug;

public class BugMainApp {
    public static void main(String[] args) {

        Bug one = new Bug("Login page does not work.", "monika@test.pl",2);
        one.allInfo();
        one.reporter();
        one.bugStatus();
        int priority = one.getBugPriority();
        System.out.println(priority);

        one.setOpen(false); // default bug status is true
        one.bugStatus();




        one.setBugDescription("hello");
        one.setBugDescription("Hello Hello Hello");
        one.setReporterEmail("xxxxx");
        one.setReporterEmail("xx@test.pl");
        one.setBugPriority(0);
        one.setBugPriority(-1);
        one.setBugPriority(5);


        one.allInfo();


    }
}
