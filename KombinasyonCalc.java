import java.util.Scanner;

public class KombinasyonCalc {
    public static void main(String[] args) {

        int n, r;
        long n_fac = 1, r_fac = 1, nminr_fac = 1, comb;
        Scanner input = new Scanner(System.in);

        System.out.print("Kombinasyonu alincak sayiyi giriniz :");
        n = input.nextInt();
        System.out.print("Kacli kombinasyonu alincagini giriniz :");
        r = input.nextInt();

        for(int i = 1; i<=n; i++){
            n_fac = n_fac * i;
        }

        for(int j = 1; j<=r; j++){
            r_fac = r_fac * j;
        }

        for(int k = 1; k<=(n-r); k++){
            nminr_fac = nminr_fac * k;
        }

        comb = n_fac / (r_fac * nminr_fac);

        System.out.println("Kombinasyon sonucu :" + comb);
    }
}
