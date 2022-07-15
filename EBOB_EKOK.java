import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {

        int n1, n2, ebob=1;


        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayiyi Giriniz :");
        n1 = input.nextInt();

        System.out.print("Ikinci Sayiyi Giriniz :");
        n2 = input.nextInt();

        mainloop:
        for (int i=1; i <= n2; i++)
        {
            for(int j=1; j <= n1; j++) {

                if (n1 * i == n2 * j) {
                    System.out.println("Iki sayinin EKOK'u :" + n1 * i);
                    break mainloop;
                }
            }
        }

        for (int i=1; i <= n1; i++)
        {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }

            else continue;


        }
        System.out.println("Iki sayinin EBOB'u :" + ebob);
    }
}
