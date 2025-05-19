package pekan3;

public class Buku {
    private String judul;

    public Buku(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    @Override
    public String toString() {
        return judul;
    }
}
