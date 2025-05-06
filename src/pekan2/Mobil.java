package pekan2;

public class Mobil {
    String platNomor;

    public Mobil(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    // Override toString untuk menampilkan plat nomor
    @Override
    public String toString() {
        return platNomor;
    }
}
