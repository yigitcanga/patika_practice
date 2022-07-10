import java.util.*;
import java.io.*;

public class KullanıcıGirisi {
    public static void main(String[] args) {

        String username, password, newPassword;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanici adiniz :");
        username = input.nextLine();

        System.out.println("Sifreniz :");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123"))
        {
            System.out.println("Giris yaptiniz!");
        }
        else
        {
            System.out.println("Sifreniz yanlis, seceneklerden biriyle ilerleyiniz :");
            System.out.println("1-Sifre degistime\n2-Sistem cikisi");

            select = input.nextInt();


            if (select == 1)
            {
                Scanner newp = new Scanner(System.in);

                System.out.println("Yeni sifrenizi belirleyiniz :");
                newPassword = newp.nextLine();

                if (newPassword.equals("java123") || newPassword.equals(password)) {
                    System.out.println("Sifre olusturulamadı, lutfen baska sifre giriniz.");
                } else {
                    System.out.println("Sifre olusturuldu");
                }
            }

            else if (select == 2)
                    System.out.println("Sistemden ciktiniz");


            else
                    System.out.println("Gecersiz sayi, sistemden ciktiniz");

            }
        }
    }
