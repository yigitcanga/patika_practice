import java.util.Scanner;

public class KDVcalc {
    public static void main(String[] args) {

        double price, kdv_percentage, kdv_of_product, total_price;

        Scanner input = new Scanner(System.in);

        System.out.print("Price of product: ");
        price = input.nextInt();

        kdv_percentage = (price > 0 && price < 1000) ? 0.18 : 0.8;
        kdv_of_product = kdv_percentage * price;
        total_price = kdv_of_product + price;

        System.out.print("KDV tax of the product is: ");
        System.out.println(kdv_of_product);

        System.out.print("Total price of the product is: ");
        System.out.println(total_price);
    }
}
