package homeworks;

public class Homework1 {
    public static void main(String[] args) {

//      1. 4 int variables
//      2. Check if the sum of two first is even or odd
//      3. Check if the sum of third and four is even or odd
//      4. Check if both sums are even or odd


        int a = 3;
        int b = 8;
        int c = 12;
        int d = 18;

        int e = c + d;
        int f = a + b;


        if ((a + b) % 2 == 0) {
            System.out.println("is even");
        } else {
            System.out.println("is odd");
        }

        if (e % 2 == 0) {
            System.out.println("is even");
        } else {
            System.out.println("is odd");
        }

        if (e % 2 == 0 && f % 2 == 0) {
            System.out.println("both sums are even");
        } else {
            System.out.println("both sums is odd");
        }

    }
}
