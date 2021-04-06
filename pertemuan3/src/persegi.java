public class persegi {
    // atribut
    private double sisi;

    // getter
    public double getSisi() {
        return sisi;
    }

    // setter
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // method
    private double hitungKeliling() {
        return (4 * sisi);
    }

    private double hitungLuas() {
        return (sisi * sisi);
    }
}
