import java.util.Scanner;

public class Bilangan {
    public static void main(String[] args) {
        int angka;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Bilangan:");

        angka = scan.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " Bilangan genap");
        } else {
            System.out.println(angka + " Bilangan ganjil");
        }
    }

}
