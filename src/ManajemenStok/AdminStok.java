package ManajemenStok;

import java.util.ArrayList;

public class AdminStok {
    private ArrayList<KategoriMenu> daftarMenu;

    public AdminStok() {
        daftarMenu = new ArrayList<>();
    }

    // Menambahkan kategori menu baru
    public void tambahMenu(KategoriMenu menu) {
        daftarMenu.add(menu);
        System.out.println("Menu " + menu.getNamaMenu() + " berhasil ditambahkan.");
    }

    // Menampilkan semua kategori menu
    public void tampilkanSemuaMenu() {
        for (KategoriMenu menu : daftarMenu) {
            menu.displayMenuInfo();
            System.out.println("---------------------------");
        }
    }

    // Menghapus kategori menu berdasarkan nama
    public void hapusMenu(String namaMenu) {
        for (KategoriMenu menu : daftarMenu) {
            if (menu.getNamaMenu().equalsIgnoreCase(namaMenu)) {
                daftarMenu.remove(menu);
                System.out.println("Menu " + namaMenu + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Menu " + namaMenu + " tidak ditemukan.");
    }

    // Update stok kategori menu berdasarkan nama
    public void updateStok(String namaMenu, int stokBaru) {
        for (KategoriMenu menu : daftarMenu) {
            if (menu.getNamaMenu().equalsIgnoreCase(namaMenu)) {
                menu.setStok(stokBaru);
                System.out.println("Stok menu " + namaMenu + " diperbarui menjadi " + stokBaru + ".");
                return;
            }
        }
        System.out.println("Menu " + namaMenu + " tidak ditemukan.");
    }

    // Update harga kategori menu
    public void updateHarga(String namaMenu, double hargaBaru) {
        for (KategoriMenu menu : daftarMenu) {
            if (menu.getNamaMenu().equalsIgnoreCase(namaMenu)) {
                menu.setHarga(hargaBaru);
                System.out.println("Harga menu " + namaMenu + " diperbarui menjadi Rp " + hargaBaru + ".");
                return;
            }
        }
        System.out.println("Menu " + namaMenu + " tidak ditemukan.");
    }
}
