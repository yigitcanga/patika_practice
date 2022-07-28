import java.util.Scanner;

public class DesenRecursive {

    public static int inis(int a)
    {
        if (a <= 0) return a;

        else
        {
            System.out.print(a + " ");
            return inis(a - 5);
        }
    }

    public static int cikis(int a, int b)
    {
        if (a > b) return a;

        else
        {
            System.out.print(a + " ");
            return cikis(a + 5, b);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayiyi giriniz: ");
        int input = scan.nextInt();

        cikis(inis(input), input);
    }
}
