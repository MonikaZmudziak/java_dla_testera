public class MathOperations {

    public static void main(String[] args) {

        // Math operators
        double a = 10;
        double b = 4;
        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);

        System.out.println(a / b); // = 2
        System.out.println(10.0 / 4.0); // = 2.5
        System.out.println(a / b); // = 2.5

        //Comparison operators
        int numOne = 1;
        int numTwo = 2;
        System.out.println(numOne > numTwo);
        System.out.println(numOne < numTwo);
        System.out.println(numOne == numTwo);
        System.out.println(numOne != numTwo);

        //Logic operators
        // || <- OR
        System.out.println(numOne > numTwo || numOne == 1); // false || true -> true
        System.out.println(numOne > numTwo || numOne != 1); // false || false -> false
        System.out.println(numOne < numTwo || numOne != 1); // true || not checked -> true

        //&& <- AND
        System.out.println(numOne < numTwo && numOne == 1); // true && true -> true
        System.out.println(numOne > numTwo && numOne == 1); // false && true -> false
        System.out.println(numOne > numTwo && numOne != 1); // false && false -> false

        // Conditional and Control Flow
        // if else - we are checking if something is true of false
        if (numOne > numTwo) {
            System.out.println("number one is less than number two");
        } else {
            System.out.println("number one is greater than number two");
        }

        // switch - takes a string and executes the appropriate part of the code

        String homePage = "Home";
        String loginPage = "Login";
        String contactPage = "Contact";

        String page = homePage; // "jakaś strona"

        switch (page) {
            case "Home":
                System.out.println("Przełączam się do strony Home");
                break;
            case "Login":
                System.out.println("Przełączam się do strony Login");
                break;
            case "Contact":
                System.out.println("Przełączam się do strony Contact");
                break;
            default:
                System.out.println("Nie znam takiej strony");

        }

        //Modulo

        System.out.println(10 % 5);
        System.out.println(10 % 3); // 10 % 3 = 3 r.1<--


        if (10 % 2 == 0) {
            System.out.println("jest liczbą parzystą");
        } else {
            System.out.println("nie jest liczbą parzystą");
        }
    }
}

