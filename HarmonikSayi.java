import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        int n;
        double result = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("N sayisini giriniz :");
        n = input.nextInt();

        for (double i = 1; i<=n; i++)
        {
            result = result + (1/i);
        }
        System.out.print("Sonuc :" + result);
    }
}
