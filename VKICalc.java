import java.util.Scanner;

public class VKICalc {
    public static void main(String[] args) {

        double boy, kilo, VKI;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz : ");
        kilo = input.nextInt();

        VKI = kilo / (boy * boy);

        System.out.print("Vucut Kitle Indeksiniz : ");
        System.out.println(VKI);
    }
}
