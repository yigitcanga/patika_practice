import java.util.Scanner;

public class BasamakToplama {
    public static void main(String[] args) {

        int number, result = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz :");
        number = input.nextInt();

        while(number != 0)
        {
            result = result + (number % 10);
            number = number / 10;
        }

        System.out.print("Basamaklar toplami :" + result);

    }
}
