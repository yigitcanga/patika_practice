
import java.util.Scanner;

public class Notorthesaplama {
    public static void main(String[] args) {
        int phys, chem, tur, math, music, hist;
        double ort;

        Scanner input = new Scanner(System.in);

        System.out.print("Physics grade: ");
        phys = input.nextInt();

        System.out.print("Chemistry grade: ");
        chem = input.nextInt();

        System.out.print("Turkish grade: ");
        tur = input.nextInt();

        System.out.print("Mathematics grade: ");
        math = input.nextInt();

        System.out.print("Music grade: ");
        music = input.nextInt();

        System.out.print("History grade: ");
        hist = input.nextInt();

        ort = (phys + chem + tur + math + music + hist) / 6;
        System.out.println("Cumulative Grade: " + ort);

        String str = (ort > 60) ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.print(str);
    }
}
