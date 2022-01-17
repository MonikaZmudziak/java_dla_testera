public class ArraysTaskTwo {
    public static void main(String[] args) {


        //count how many even and odd numbers are in the array

        int[] numbers = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};

        int even = 0;
        int odd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }

        System.out.println("Liczby parzyste: " + even);
        System.out.println("Liczby nieparzyste: "  + odd);

    }
}
