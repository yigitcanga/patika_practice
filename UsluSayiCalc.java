import java.util.Scanner;

public class UsluSayiCalc {
    public static void main(String[] args) {

        int n, r, result = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Ussu alincak sayiyi giriniz :");
        n = input.nextInt();
        System.out.print("Kacinci dereceden ussu alincagini giriniz :");
        r = input.nextInt();

        for (int i = 1; i <= r; i++)
        {
            result = result * n;
        }

        System.out.print("Sonuc :" + result);
    }
}
