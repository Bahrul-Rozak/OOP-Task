public class variableInstance {
    int jumlahBarang = 5;

    // method
    public void tambahBarang() {
        jumlahBarang = jumlahBarang + 1;
        System.out.println("Jumlah barang setelah di tambah " + jumlahBarang);
    }

    public void getJumlahBarang() {
        System.out.println("Jumlah Barang " + jumlahBarang);
    }

    public static void main(String[] args) {
        variableInstance barang = new variableInstance();
        barang.getJumlahBarang();
        barang.tambahBarang();
    }
}
