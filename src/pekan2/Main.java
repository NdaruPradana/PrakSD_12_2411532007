package pekan2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    static class Parkiran {
        ArrayList<Mobil> daftarMobil = new ArrayList<>();

        public void tambahMobil(String platNomor) {
            daftarMobil.add(new Mobil(platNomor));
            System.out.println("Mobil dengan plat " + platNomor + " berhasil ditambahkan.");
        }

        public void keluarkanMobil(String platNomor) {
            boolean ditemukan = false;
            for (int i = 0; i < daftarMobil.size(); i++) {
                if (daftarMobil.get(i).platNomor.equalsIgnoreCase(platNomor)) {
                    daftarMobil.remove(i);
                    System.out.println("Mobil dengan plat " + platNomor + " berhasil dikeluarkan.");
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                System.out.println("Mobil dengan plat " + platNomor + " tidak ditemukan di parkiran.");
            }
        }

        public void tampilkanParkiran() {
            if (daftarMobil.isEmpty()) {
                System.out.println("Parkiran kosong.");
            } else {
                System.out.println("Mobil di dalam parkiran:");
                for (Mobil m : daftarMobil) {
                    System.out.println("- " + m);
                }
            }
        }

        public void cariMobil(String platNomor) {
            for (Mobil m : daftarMobil) {
                if (m.platNomor.equalsIgnoreCase(platNomor)) {
                    System.out.println("Mobil dengan plat " + platNomor + " ditemukan di parkiran.");
                    return;
                }
            }
            System.out.println("Mobil dengan plat " + platNomor + " tidak ada di parkiran.");
        }
    }

    public static void main(String[] args) {
        Parkiran parkiran = new Parkiran();
        Scanner scanner = new Scanner(System.in);

       
        String[] platAwal = {"BA1111AA", "BA2222BB", "BA3333CC", "BA4444DD", "BA5555EE", "BA6666FF", "BA7777GG"};
        for (String plat : platAwal) {
            parkiran.tambahMobil(plat);
        }

        int pilihan;
        do {
            System.out.println("\n=== Menu Parkiran Mobil ===");
            System.out.println("1. Tambah mobil ke Parkiran");
            System.out.println("2. Keluarkan mobil dari Parkiran");
            System.out.println("3. Tampilkan isi Parkiran");
            System.out.println("4. Cari mobil di Parkiran");
            System.out.println("5. Keluar");
            System.out.print("Pilih Opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // bersihkan enter

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan plat nomor mobil: ");
                    String platMasuk = scanner.nextLine();
                    parkiran.tambahMobil(platMasuk);
                    break;
                case 2:
                    System.out.print("Masukkan plat nomor mobil yang akan keluar: ");
                    String platKeluar = scanner.nextLine();
                    parkiran.keluarkanMobil(platKeluar);
                    break;
                case 3:
                    parkiran.tampilkanParkiran();
                    break;
                case 4:
                    System.out.print("Masukkan plat nomor yang dicari: ");
                    String platCari = scanner.nextLine();
                    parkiran.cariMobil(platCari);
                    break;
                case 5:
                    System.out.println("Program selesai. Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
