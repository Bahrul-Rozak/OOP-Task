/*
Nama : Bahrul Rozak
NIM : 1903015050
Kelas : 4 E Teknik Informatika
*/

package Data;

public class LuasKeliling {
    public static void main(String[] args) {
        double k, a, b, lp, kp, l, phi = 3.14;
        Scanner scan = new Scanner(System.in);
        // Program akan menerima input dari user
        System.out.print("Masukkan input pertama: ");
        a = scan.nextDouble();
        System.out.print("Masukkan input kedua: ");
        b = scan.nextDouble();
        // Rumus
        k = 2 * phi * a;
        l = phi * a * a;
        lp = a * b;
        kp = 2 * (a + b);
        // Return
        Integer getKelilingLingkaran(){
            return k;
        }
        Integer getLuasLingkaran(){
            return l;
        }
        Integer getLuasPersegiPanjang(){
            return lp;
        }
        Integer getKelilingPersegiPanjang(){
            return kp;
        }
        System.out.println("Keliling Lingkaran adalah " + format("%.2f", k));
        System.out.println("Luas Lingkaran adalah " + format("%.2f", l));
        System.out.println("Keliling Persegi Panjang adalah " + format("%.2f", kp));
        System.out.println("Luas Persegi Panjang adalah " + format("%.2f", lp));
    }
}
