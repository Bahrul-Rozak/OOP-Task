public interface TokoBuku {
    public class Buku {
        // Menentukan tipe data
        String judulBuku = "Pemrograman dengan Java";
        String penulisBuku = "Adam M Bachtiar";
        String penerbit = "Informatika";
        String kota = "Bandung";
        Integer Telp = 021 - 123456;
        String HargaBuku = "Rp.250000";
        Integer JumlahBuku = 5;
        Integer Totalhal = 262;

        String getjudulBuku() {
            return judulBuku;
        }

        String getpenulisBuku() {
            return penulisBuku;
        }

        String getpenerbitBuku() {
            return penerbit;
        }

        String getkota() {
            return kota;
        }

        Integer getTelp() {
            return Telp;
        }

        String gethargaBuku() {
            return HargaBuku;
        }

        Integer getjumlahBuku() {
            return JumlahBuku;
        }

        Integer gettotalHal() {
            return Totalhal;
        }

    }

    public static void main(String[] args) {
        Buku data = new Buku();
        System.out.println("----------------------------------");
        System.out.println("Informasi Buku");
        System.out.println("----------------------------------");
        System.out.println("Judul Buku :" + data.getjudulBuku());
        System.out.println("Penulis Buku :" + data.getpenulisBuku());
        System.out.println("Penerbit:" + data.getpenerbitBuku());
        System.out.println("Kota: " + data.getkota());
        System.out.println("Telp: " + data.getTelp());
        System.out.println("Harga Buku: " + data.gethargaBuku());
        System.out.println("Jumlah Buku: " + data.getjumlahBuku());
        System.out.println("Total Halaman: " + data.gettotalHal());
    }
}