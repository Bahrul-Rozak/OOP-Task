public class tester {
    public static void main(String[] args) {
        // Persegi persegi = new Persegi(5);
        // System.out.println("Data persegi saya ambil dari class Persegi");
        // System.out.println("Luas " + persegi.hitungLuas());
        // System.out.println("Panjang Sisi" + persegi.getSisi());

        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(5);
        pp.setLebar(7);
        System.out.println("Luas persegi panjang " + pp.hitungLuas());
    }
}
