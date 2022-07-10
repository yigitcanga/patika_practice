import java.util.Scanner;

public class TekSayiToplami {
    public static void main(String[] args) {

        int sayi = 0, sum = 0;
        boolean k = true;
        Scanner input = new Scanner(System.in);

        while(k)
        {
            System.out.print("Tek bir sayi giriniz :");
            sayi = input.nextInt();

            if(sayi%2 ==1) k = false;
            else System.out.println("Tek bir sayi girmediniz");

        }

        for (int i = 0; i <= sayi; i++)
        {

            if (i % 2 == 0 && i % 4 == 0 )
            {
                sum = sum + i;

            }
        }

        System.out.print("Girilen sayiya kadar cift ve 4e tam bolunen sayilarin toplami :" + sum);
    }
}
