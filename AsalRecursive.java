import java.util.Scanner;

public class AsalRecursive {

    public static int asal(int a,int b) {

        int sum;
        if (b>1)
        {
            sum = (a % b) * (asal(a,b-1));

        }
        else return 1;

        return sum;



    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int input = scan.nextInt();
        int sonuc = asal(input,input -1);
        if (sonuc == 0) System.out.println(input + " sayisi ASAL degildir");
        else System.out.println(input + " sayisi ASALDIR");
    }


}