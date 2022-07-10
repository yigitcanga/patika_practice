import java.util.*;
import java.io.*;

public class HesapMakinesi {
    public static void main(String[] args) {
        int  select;
        double result, number1, number2;

        Scanner input = new Scanner(System.in);

        System.out.println("Ilk sayiyi giriniz :");
        number1 = input.nextDouble();

        System.out.println("Ikinci sayiyi giriniz :");
        number2 = input.nextDouble();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Islemi seciniz :");
        select = input.nextInt();

        switch(select)
        {
            case 1:
                result = number1 + number2;
                System.out.println("Sonuc :");
                System.out.println(result);
                break;

            case 2:
                result = number1 - number2;
                System.out.println("Sonuc :");
                System.out.println(result);
                break;

            case 3:
                result = number1 * number2;
                System.out.println("Sonuc :");
                System.out.println(result);
                break;

            case 4:
                result = number1 / number2;
                System.out.println("Sonuc :");
                System.out.println(result);
                break;

            default:
                System.out.println("Dort islemden birini seciniz");
                break;
        }
    }
}
