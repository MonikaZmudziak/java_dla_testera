package homeworks.homework3model;

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

//    1. change all fields to private
//    2. generate getters and setters to all fields


    private String bugDescription;
    private String reporterEmail;
    private int bugPriority;
    private boolean isOpen; // = true


    public Bug(String bugDescription, String reporterEmail, int bugPriority) {

        this.bugDescription = bugDescription;
        this.reporterEmail = reporterEmail;
        this.bugPriority = bugPriority;
        this.isOpen = true; // default: open

    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("Description should have more than 9 characters");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public String getReporterEmail() {
        return reporterEmail;
    }

    public void setReporterEmail(String reporterEmail) {
        if (reporterEmail.contains("@")) {  //(!reporterEmail..... - not contains)
            this.reporterEmail = reporterEmail;
        } else {
            System.out.println("Email should contains @ symbol");
        }
    }

    public int getBugPriority() {
        return bugPriority;
    }

    public void setBugPriority(int bugPriority) {
        if (bugPriority <= 1 && bugPriority >= 5) {
            this.bugPriority = bugPriority;
        } else {
            System.out.println("Bug priority should contains 1 -5 values");
        }

/*     OR
   public void setBugPriority(int bugPriority) {
        switch(bugPriority{)
          case 1:
              this.bugPriority = bugPriority;
              break;
          case 2:
              this.bugPriority = bugPriority;
              break;
          case 3:
              this.bugPriority = bugPriority;
              break;
          case 4:
              this.bugPriority = bugPriority;
              break;
          case 5:
              this.bugPriority = bugPriority;
              break;
          default:{
               System.out.println("Incorrect bug priority range");
          }

        }

        OR
        public void setBugPriority(int bugPriority) {
        switch(bugPriority{)
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
              this.bugPriority = bugPriority;
              break;
          default:{
               System.out.println("Incorrect bug priority range");

*/

    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void allInfo() {
        System.out.println("Bug description: " + bugDescription + " Reported by: " + reporterEmail + ". Bug Priority: "
                + bugPriority + ". Bug status: is open: " + isOpen);
    }

    public void reporter() {
        System.out.println("Reported by: " + reporterEmail);
    }

    public void bugStatus() {
        System.out.println("Bug status: is open: " + isOpen);
    }


}




