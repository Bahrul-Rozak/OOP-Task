// Nama : Bahrul Rozak
// NIM : 1903015050

public class bentukAir {
    private double temperature;

    public bentukAir(double temperature) {
        this.temperature = temperature;
    }

    public String getdataTemperature() {
        if (temperature < 0) {
            return "Es - Beku";
        } else if (temperature == 0) {
            return "Transisi Es dan Cair";
        } else if (temperature > 0 && temperature < 100) {
            return "Air - Cair";
        } else if (temperature == 100) {
            return "Transisi Cair dan Uap";
        } else if (temperature > 100) {
            return "Uap - Gas";
        }
        return " ";
    }

    public String toString() {
        String str = "Air bersuhu : " + temperature + "\n" + "Berbentuk : " + getdataTemperature();
        return str;
    }

    static void suhu1() {
        System.out.println(new bentukAir(-10));
        System.out.println(new bentukAir(0));
        System.out.println(new bentukAir(0));
        System.out.println(new bentukAir(100));
        System.out.println(new bentukAir(110));
    }

    static void suhu() {
        suhu1();
    }

    public static void main(String[] args) {
        suhu();
    }
}
