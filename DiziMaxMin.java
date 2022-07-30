import java.util.Scanner;
import java.lang.Math;

public class DiziMaxMin {

    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        int number, fark, min_fark_kucuk = 1000000000, min_fark_buyuk = 100000000;

        Scanner input = new Scanner(System.in);

        System.out.print("Girilen Sayi : ");
        number = input.nextInt();

        for (int i : list) {
            fark = Math.abs(number - i);
            if (fark < min_fark_kucuk && i < number) {
                min_fark_kucuk = fark;
            }
            if (fark < min_fark_buyuk && i > number) {
                min_fark_buyuk = fark;
            }
        }

        System.out.println("Girilen sayidan kucuk en yakin sayi " + (number - min_fark_kucuk));
        System.out.println("Girilen sayidan buyuk en yakin sayi " + (number + min_fark_buyuk));

    }
}
