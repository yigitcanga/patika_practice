import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {

        int sayi, sum = 0, counter = 0;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz :");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++)
        {

            if (i % 3 == 0 && i % 4 == 0 )
            {
                sum = sum + i;
                counter++;

            }
        }

        average = sum / counter;
        System.out.print("Girilen sayiya kadar 3e ve 4e tam bolunen sayilarin ortalamasi :" + average);
    }
}
