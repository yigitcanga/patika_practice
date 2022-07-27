import java.util.Scanner;

public class Palindrom {

    static boolean Palindrom(int number)
    {
        int temp=number,sum = 0, last_digit;


        while (temp !=0)
        {
            last_digit = temp % 10;
            sum *= 10;
            sum += last_digit;
            temp /= 10;

        }

        if (sum == number) return true;
        else return false;


    }
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        sayi = input.nextInt();

        boolean a = Palindrom(sayi);
        if (a) System.out.println("Girdiginiz sayi Palindrom'dur.");
        else System.out.println("Girdiginiz sayi Palindrom degildir.");
    }
}
