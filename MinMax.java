import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        int adet, min = 0, max = 0, i = 2;

        Scanner input = new Scanner(System.in);

        System.out.print("Kac tane sayi gireceksiniz: ");
        adet = input.nextInt();

        int sayi;

        System.out.print("1. sayiyi giriniz: ");
        sayi = input.nextInt();
        min = sayi;
        max = sayi;

        while (i <= adet)
        {
            int number;
            System.out.print(i + ". sayiyi giriniz: ");
            number = input.nextInt();

            if (number < min) min=number;
            if (number > min) max=number;

            i++;
        }

        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);
    }
}
