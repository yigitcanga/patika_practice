import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanSiralama {
    public static void main(String[] args) {

        int boyut, eleman, temp;

        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        boyut = input.nextInt();

        int[] liste = new int[boyut];

        System.out.println("Dizinin elemanlarini giriniz : ");

        for(int i=0; i<boyut; i++)
        {
            System.out.print((i+1) + ". Elemani : ");
            eleman = input.nextInt();
            liste[i] = eleman;
        }

        for(int i = 0; i < boyut; i++)
        {
            for(int j = i+1; j < boyut; j++)
            {
                if(liste[j] < liste[i]) {
                    temp = liste[i];
                    liste[i] = liste[j];
                    liste[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(liste));
    }
}
