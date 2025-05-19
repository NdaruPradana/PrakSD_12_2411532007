package pekan3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PerpustakaanMini perpustakaan = new PerpustakaanMini();

        while (true) {
            System.out.println("\n=== MENU PERPUSTAKAAN MINI ===");
            System.out.println("1. Tambah Buku ke Tumpukan");
            System.out.println("2. Ambil Buku Teratas");
            System.out.println("3. Lihat Tumpukan Buku");
            System.out.println("4. Cari Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine(); // konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan judul buku: ");
                    String judulBaru = input.nextLine();
                    perpustakaan.tambahBuku(new Buku(judulBaru));
                    break;
                case 2:
                    perpustakaan.ambilBuku();
                    break;
                case 3:
                    perpustakaan.lihatTumpukan();
                    break;
                case 4:
                    System.out.print("Masukkan judul buku yang dicari: ");
                    String judulCari = input.nextLine();
                    perpustakaan.cariBuku(judulCari);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan Perpustakaan Mini.");
                    input.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
            }
        }
    }
}
