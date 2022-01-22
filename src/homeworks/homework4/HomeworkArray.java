package homeworks.homework4;

public class HomeworkArray {

    public static void main(String[] args) {


        // Sort descending

        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};
        //               0  1  2  2  4  4  5  5  8  9


        int max;


        for (int i = 0; i < numbers.length; i++) {
            max = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > max) {
                    max = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = max;
                }
            }
        }

        for (int number : numbers) {
            System.out.println(number);
        }


    }
}
