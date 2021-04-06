public class variableLocal {
    public void tambahBarang() {
        // variable local
        int jumlahBarang = 0;

        jumlahBarang = jumlahBarang + 1;
        System.out.println("Jumlah barang setelah ditambah" + jumlahBarang);
    }

    public static void main(String[] args) {
        variableLocal Barang = new variableLocal();
        // panggil method
        Barang.tambahBarang();
    }
}
