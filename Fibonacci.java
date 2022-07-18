import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int limit, sum = 1, prev = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci eleman limiti: ");
        limit = input.nextInt();

        System.out.print("0 1 1 ");

        for (int i = 2; i<limit; i++)
        {
            int j = sum;
            sum = sum + prev;
            System.out.print(sum + " ");
            prev = j;

        }
    }
}
