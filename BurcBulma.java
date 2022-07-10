import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int month, day;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dogdugunuz ayini giriniz: ");
        month = sc.nextInt();

        if (month == 1)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Ayin hangi gunu dogdugunuzu giriniz: ");
            day = input.nextInt();

            if (1 <= day && day <= 21) System.out.println("Oglak Burcusunuz ");
            else System.out.println("Kova Burcusunuz ");
        }

        if (month == 2)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Ayin hangi gunu dogdugunuzu giriniz: ");
            day = input.nextInt();

            if (1 <= day && day <= 19) System.out.println("Kova Burcusunuz ");
            else System.out.println("Balık Burcusunuz ");
        }

        if (month == 3)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Ayin hangi gunu dogdugunuzu giriniz: ");
            day = input.nextInt();

            if (1 <= day && day <= 20) System.out.println("Balık Burcusunuz ");
            else System.out.println("Koc Burcusunuz ");
        }

        if (month == 4)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Ayin hangi gunu dogdugunuzu giriniz: ");
            day = input.nextInt();

            if (1 <= day && day <= 20) System.out.println("Koc Burcusunuz ");
            else System.out.println("Boga Burcusunuz ");
        }

        if (month == 5)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Ayin hangi gunu dogdugunuzu giriniz: ");
            day = input.nextInt();

            if (1 <= day && day <= 21) System.out.println("Boga Burcusunuz ");
            else System.out.println("Ikizler Burcusunuz ");
        }

        if (month == 6)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Ayin hangi gunu dogdugunuzu giriniz: ");
            day = input.nextInt();

            if (1 <= day && day <= 22) System.out.println("Ikizler Burcusunuz ");
            else System.out.println("Yengec Burcusunuz ");
        }

        if (month == 7)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Ayin hangi gunu dogdugunuzu giriniz: ");
            day = input.nextInt();

            if (1 <= day && day <= 22) System.out.println("Yengec Burcusunuz ");
            else System.out.println("Aslan Burcusunuz ");
        }

        if (month == 8)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Ayin hangi gunu dogdugunuzu giriniz: ");
            day = input.nextInt();

            if (1 <= day && day <= 22) System.out.println("Aslan Burcusunuz ");
            else System.out.println("Basak Burcusunuz ");
        }

        if (month == 9)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Ayin hangi gunu dogdugunuzu giriniz: ");
            day = input.nextInt();

            if (1 <= day && day <= 22) System.out.println("Basak Burcusunuz ");
            else System.out.println("Terazi Burcusunuz ");
        }

        if (month == 10)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Ayin hangi gunu dogdugunuzu giriniz: ");
            day = input.nextInt();

            if (1 <= day && day <= 22) System.out.println("Terazi Burcusunuz ");
            else System.out.println("Akrep Burcusunuz ");
        }

        if (month == 11)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Ayin hangi gunu dogdugunuzu giriniz: ");
            day = input.nextInt();

            if (1 <= day && day <= 21) System.out.println("Akrep Burcusunuz ");
            else System.out.println("Yay Burcusunuz ");
        }

        if (month == 12)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Ayin hangi gunu dogdugunuzu giriniz: ");
            day = input.nextInt();

            if (1 <= day && day <= 21) System.out.println("Yay Burcusunuz ");
            else System.out.println("Oglak Burcusunuz ");
        }

    }
}
