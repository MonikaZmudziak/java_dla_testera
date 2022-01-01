package homeworks;

public class Bug {

/*
    Object fields:
    - bug description
    - reporter's e-mail
    - bug priority (1-5)
    - bug status (open / closed) - open by default

    Constructor

    Methods:
    - show all information about the bug
    - show reporter
    - show error status
    - return error priority
*/


    String bugDescription;
    String reporterEmail;
    int bugPriority;
    boolean isOpen; // = true


    Bug(String bugDescription, String reporterEmail, int bugPriority) {

        this.bugDescription = bugDescription;
        this.reporterEmail = reporterEmail;
        this.bugPriority = bugPriority;
        this.isOpen = true; // default: open

    }

    void allInfo() {
        System.out.println("Bug description: " + bugDescription + " Reported by: " + reporterEmail + ". Bug Priority: "
                + bugPriority + ". Bug status: is open: " + isOpen);
    }

    void reporter() {
        System.out.println("Reported by: " + reporterEmail);
    }

    void bugStatus() {
        System.out.println("Bug status: is open: " + isOpen);
    }

    int getBugPriority() {
        return bugPriority;
    }


}


