//import java.io.BufferedReader;
//import java.io.InputStream;
//import java.io.InputStreamReader;

// Nama : Bahrul Rozak

// NIM : 1903015050

import java.io.*;

public class nilaiMHS {
    private double uts, uas;
    private int password;

    public static String bacaInputan() {
        String baca = " ";
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(input);

        try {
            baca = buf.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        return baca;
    }

    public nilaiMHS(double uts, double uas) {
        this.uts = uts;
        this.uas = uas;
    }

    double ratarata() {
        return (uts + uas) / 2;
    }

    public void cetak() {
        System.out.println("Berikut adalah nilai PBO kamu");
        System.out.println("Nilai UTS " + uts);
        System.out.println("Nilai UAS " + uas);
        System.out.println("Rata - rata " + ratarata());
    }

    public void getNilai() {
        System.out.println("Masukkan password : ");
        password = Integer.parseInt(bacaInputan());
        if (password == 123) {
            System.out.println("Berhasil masuk");
            cetak();
        } else {
            System.out.println("Password salah");
        }
    }
}
