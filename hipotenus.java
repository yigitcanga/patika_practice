import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        int ilk_kenar, ikinci_kenar;
        double hipotenus;

        Scanner input = new Scanner(System.in);

        System.out.print("Ilk Kenar Uzunlugu: ");
        ilk_kenar = input.nextInt();

        System.out.print("Ikinci Kenar Uzunlugu: ");
        ikinci_kenar = input.nextInt();

        hipotenus = Math.sqrt((ilk_kenar*ilk_kenar)+(ikinci_kenar*ikinci_kenar));
        System.out.print("Hipotenus Uzunlugu: ");
        System.out.print(hipotenus);
    }
}
