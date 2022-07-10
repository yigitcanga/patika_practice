import java.util.Scanner;

public class KuvvetYazanProgram {
    public static void main(String[] args) {

        int i=4,sayi,j=5;
        Scanner input = new Scanner(System.in);

        System.out.print("Sinir sayisini giriniz :");
        sayi = input.nextInt();

        while(i<=sayi)
        {
            System.out.println(i);
            if(j<sayi) System.out.println(j);
            i *= 4;
            j *= 5;
        }

    }
}
