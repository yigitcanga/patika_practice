import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int x;
        double price, final_price;

        Scanner input = new Scanner(System.in);

        System.out.print("Alinan yol(km): ");
        x = input.nextInt();

        price = (x*2.2) + 10;

        final_price = (price > 20) ? price : 20;
        System.out.print("Odenecek tutar: ");
        System.out.print(final_price);
    }
}
