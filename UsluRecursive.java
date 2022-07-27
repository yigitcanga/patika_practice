import java.util.Scanner;

public class UsluRecursive {

    public static int power(int a, int b) {


        int result = 1;

        if (b > 0) result = a * power(a, b-1);

        return result;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Taban degeri giriniz : ");
        int base = scan.nextInt();
        System.out.print("Us degeri giriniz : ");
        int power = scan.nextInt();

        int sonuc = power(base, power);
        System.out.print("Sonuc : " + sonuc);

    }
}
