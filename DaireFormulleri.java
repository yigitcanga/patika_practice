import java.util.Scanner;

public class DaireFormulleri {
    public static void main(String[] args) {

        double yaricap, pi=3.14, alan, cevre;

        Scanner input = new Scanner(System.in);

        System.out.print("Yaricap Uzunlugu: ");
        yaricap = input.nextInt();

        alan = pi * yaricap * yaricap;
        cevre = 2 * pi * yaricap;

        System.out.print("Dairenin alani: ");
        System.out.println(alan);

        System.out.print("Dairenin cevresi: ");
        System.out.println(cevre);
    }
}
