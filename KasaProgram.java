import java.util.Scanner;

public class KasaProgram {
    public static void main(String[] args) {

        double kilo, armut=2.14, elma=3.67, dom=1.11, muz=0.95, patlican=5.00, toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kac Kilo ? : ");
        kilo = input.nextDouble();
        toplam = toplam + kilo*armut;

        System.out.print("Elma Kac Kilo ? : ");
        kilo = input.nextDouble();
        toplam = toplam + kilo*elma;

        System.out.print("Domates Kac Kilo ? : ");
        kilo = input.nextDouble();
        toplam = toplam + kilo*dom;

        System.out.print("Muz Kac Kilo ? : ");
        kilo = input.nextDouble();
        toplam = toplam + kilo*muz;

        System.out.print("Patlican Kac Kilo ? : ");
        kilo = input.nextDouble();
        toplam = toplam + kilo*patlican;

        System.out.print("Toplam ucret : ");
        System.out.println(toplam);
    }
}
