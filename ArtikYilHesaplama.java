import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Yili giriniz :");
        year = input.nextInt();

        if (year % 4 == 0)
        {
            if (year % 100 == 0 && year % 400 != 0)
            {
                System.out.print(year);
                System.out.print(" bir artik yil degildir");
            }

            else
            {
                System.out.print(year);
                System.out.print(" bir artik yildir");
            }
        }

        else
        {
            System.out.print(year);
            System.out.print(" bir artik yil degildir");
        }
    }
}
