public class tester {
    public static void main(String[] args) {
        persegi persegi1 = new persegi();
        System.out.println("Data persegi saya ambil dari class Persegi");
        System.out.println("Luas " + persegi1.luas());
        System.out.println("Panjang Sisi" + persegi1.keliling());

        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(5);
        pp.setLebar(7);
        System.out.println("Luas persegi panjang " + pp.hitungLuas());
    }
}
