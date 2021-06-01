public class Persegi {
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

    public double luas() {
        return sisi * sisi;
    }

    public double keliling() {
        return 4 * sisi;
    }
}