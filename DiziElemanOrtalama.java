public class DiziElemanOrtalama {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            double a = numbers[i];
            result = result + (1/a);
        }

        System.out.println(numbers.length / result);
    }

}
