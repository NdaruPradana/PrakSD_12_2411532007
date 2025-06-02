package pekan6;

public class DaftarBelanja {
    private Node head;
    private Node tail;

    public void tambahItem(String nama, int kuantitas, String kategori) {
        ItemBelanja item = new ItemBelanja(nama, kuantitas, kategori);
        Node newNode = new Node(item);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Item berhasil ditambahkan!");
    }

    public void hapusItem(String nama) {
        Node current = head;

        while (current != null) {
            if (current.data.nama.equalsIgnoreCase(nama)) {
                if (current == head && current == tail) {
                    head = tail = null;
                } else if (current == head) {
                    head = head.next;
                    head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                System.out.println("Item berhasil dihapus.");
                return;
            }
            current = current.next;
        }

        System.out.println("Item tidak ditemukan.");
    }

    public void tampilkanSemuaItem() {
        if (head == null) {
            System.out.println("Daftar belanja kosong.");
            return;
        }

        System.out.println("--- Daftar Belanja ---");
        Node current = head;
        while (current != null) {
            System.out.printf("- %s (%d) [%s]%n", current.data.nama, current.data.kuantitas, current.data.kategori);
            current = current.next;
        }
    }

    public void tampilkanPerKategori(String kategori) {
        boolean ditemukan = false;
        Node current = head;
        System.out.println("--- Item dalam kategori '" + kategori + "' ---");

        while (current != null) {
            if (current.data.kategori.equalsIgnoreCase(kategori)) {
                System.out.printf("- %s (%d)%n", current.data.nama, current.data.kuantitas);
                ditemukan = true;
            }
            current = current.next;
        }

        if (!ditemukan) {
            System.out.println("Tidak ada item dalam kategori tersebut.");
        }
    }

    public void cariItem(String nama) {
        Node current = head;

        while (current != null) {
            if (current.data.nama.equalsIgnoreCase(nama)) {
                System.out.printf("Item ditemukan: %s (%d) [%s]%n",
                        current.data.nama, current.data.kuantitas, current.data.kategori);
                return;
            }
            current = current.next;
        }

        System.out.println("Item tidak ditemukan.");
    }
}
