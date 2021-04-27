import java.util.Scanner;

public class Biodata {
    public static void main(String[] args) {
        String Nama, NIM, Kelas;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda: ");
        Nama = scan.nextLine();
        System.out.print("Masukkan NIM Anda: ");
        NIM = scan.nextLine();
        System.out.print("Masukkan Kelas Anda: ");
        Kelas = scan.nextLine();
        System.out.println("Biodata Anda");
        System.out.print("Nama: " + Nama + System.lineSeparator());
        System.out.print("Kelas: " + NIM + System.lineSeparator());
        System.out.print("Kelas: " + Kelas + System.lineSeparator());

    }
}
