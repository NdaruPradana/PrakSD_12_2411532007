package pekan3;

import java.util.Stack;

public class PerpustakaanMini {
    private Stack<Buku> tumpukanBuku = new Stack<>();

    public PerpustakaanMini() {

        tambahBuku(new Buku("Algoritma Dasar"));
        tambahBuku(new Buku("Struktur Data"));
        tambahBuku(new Buku("Basis Data"));
        tambahBuku(new Buku("Pemrograman Java"));
        tambahBuku(new Buku("Jaringan Komputer"));
        tambahBuku(new Buku("Sistem Operasi"));
        tambahBuku(new Buku("Kecerdasan Buatan")); 
    }

    public void tambahBuku(Buku buku) {
        tumpukanBuku.push(buku);
        System.out.println("Buku ditambahkan: " + buku.getJudul());
    }

    public void ambilBuku() {
        if (!tumpukanBuku.isEmpty()) {
            Buku buku = tumpukanBuku.pop();
            System.out.println("Buku diambil: " + buku.getJudul());
        } else {
            System.out.println("Tumpukan kosong, tidak ada buku untuk diambil.");
        }
    }

    public void lihatTumpukan() {
        if (tumpukanBuku.isEmpty()) {
            System.out.println("Tumpukan buku kosong.");
        } else {
            System.out.println("Tumpukan Buku Saat Ini:");
            for (int i = tumpukanBuku.size() - 1; i >= 0; i--) {
                System.out.println("- " + tumpukanBuku.get(i).getJudul());
            }
        }
    }

    public void cariBuku(String judul) {
        boolean ditemukan = false;
        for (Buku buku : tumpukanBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Buku \"" + judul + "\" ditemukan dalam tumpukan.");
        } else {
            System.out.println("Buku \"" + judul + "\" tidak ditemukan.");
        }
    }
}
