import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        int sayi, toplam = 0;
        Scanner input = new Scanner(System.in);

        while(true)
        {
            System.out.print("Bir sayi giriniz: ");
            sayi = input.nextInt();

            for(int i=1; i<sayi; i++)
            {
                if (sayi % i == 0) toplam += i;
            }

            if (toplam == sayi) System.out.println(sayi + " Mukemmel sayidir");
            else System.out.println(sayi + " Mukemmel sayi degildir");

            toplam = 0;
        }

    }
}
