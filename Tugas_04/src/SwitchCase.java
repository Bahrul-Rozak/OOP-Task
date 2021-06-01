import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan, nilai, i, j;
        String nama, nim, kelas;

        System.out.println("==============================================");
        System.out
                .print("Masukan Pilihan: \n [1. Biodata] \n [2. Segitiga Bintang] \n [3. Ganjil atau Genap]\n pilih:");
        pilihan = input.nextInt();
        System.out.println("==============================================");

        switch (pilihan) {
            case 1:
                System.out.println("Biodata");
                System.out.print("Masukkan Nama Anda:");
                nama = input.next();
                System.out.print("Masukkan NIM Anda: ");
                nim = input.next();
                System.out.print("Masukkan Kelas Anda: ");
                kelas = input.next();
                System.out.println("=====================================");
                System.out.println("=          Biodata Anda             =");
                System.out.println("=====================================");
                System.out.println("= Nama:" + nama);
                System.out.println("= NIM:" + nim);
                System.out.println("= Kelas:" + kelas);
                break;
            case 2:
                System.out.println("Segitiga Bintang");
                System.out.print("Masukan Nilai : ");
                nilai = input.nextInt();
                for (i = 1; i <= nilai; i++) {
                    for (j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Ganjil atau Genap");
                System.out.print("Masukan Nilai : ");
                nilai = input.nextInt();
                if (nilai % 2 == 1) {
                    System.out.println(nilai + " Adalah bilangan GANJIL ");
                } else
                    System.out.println(nilai + " Adalah bilangan GENAP ");

                break;
        }
        System.out.println("");
    }
}