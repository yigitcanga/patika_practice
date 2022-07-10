import java.util.Scanner;

public class EtkinlikOneri {
    public static void main(String[] args) {

        double temp;

        Scanner input = new Scanner(System.in);
        System.out.println("Sicakligi giriniz :");
        temp = input.nextDouble();

        if (temp < 5) System.out.println("Kayak yapmak onerilir");
        else if (5 <= temp && temp < 15) System.out.println("Sinemaya gitmek onerilir");
        else if (15 <= temp && temp < 25) System.out.println("Piknik yapmak onerilir");
        else System.out.println("Yuzmeye gitmek onerilir");

    }
}
