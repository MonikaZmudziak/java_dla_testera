public class ArraysTaskThree {

    public static void main(String[] args) {

        // sort items in the arrray


        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};
        //               0  1  2  2  4  4  5  5  8  9


        int min;

        for (int i = 0; i < numbers.length; i++) {
            min = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }


    }


}







