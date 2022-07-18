import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {

        int toplam = 0;

        for(int i=2; i<100; i++)
        {
            for(int j=2; j<i; j++)
            {
                if (i % j == 0) toplam++;
            }

            if (toplam == 0) System.out.print(i + " ");

            toplam = 0;
        }


    }
}
