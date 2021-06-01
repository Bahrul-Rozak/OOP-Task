public class Tester {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setSisi(10);
        System.out.println("Luas " + persegi.luas());
        System.out.println("Panjang Sisi" + persegi.keliling());

        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(5);
        pp.setLebar(7);
        System.out.println("Luas persegi panjang " + pp.hitungLuas());
    }
}