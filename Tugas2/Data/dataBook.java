package Data;

public class dataBook {
    // Menentukan tipe data
    String judulBuku = "buku";
    String penulisBuku = "Mr";
    Integer jumlahBuku = 100;

    String getjudulBuku() {
        return judulBuku;
    }

    String getpenulisBuku() {
        return penulisBuku;
    }

    Integer getjumlahBuku() {
        return jumlahBuku;
    }

    public static void main(String[] args) {
        dataBook data = new dataBook();
        System.out.println("Judul Buku :" + data.getjudulBuku());
        System.out.println("Penulis Buku :" + data.getpenulisBuku());
        System.out.println("Jumlah  Buku :" + data.getjumlahBuku());
    }
}
