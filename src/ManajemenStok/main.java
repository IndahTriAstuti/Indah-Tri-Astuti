package ManajemenStok;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        AdminStok adminStok = new AdminStok();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\n=== Aplikasi Manajemen Stok 'Mie Ayam Bakso Pak Kosim' ===");
            System.out.println("1. Tambah Menu");
            System.out.println("2. Lihat Semua Menu");
            System.out.println("3. Hapus Menu");
            System.out.println("4. Update Stok Menu");
            System.out.println("5. Update Harga Menu");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            
            int option = scanner.nextInt();
            scanner.nextLine();  // Menangkap enter

            switch (option) {
                case 1:
                    System.out.print("Masukkan nama menu: ");
                    String namaMenu = scanner.nextLine();
                    System.out.print("Masukkan jumlah stok: ");
                    int stok = scanner.nextInt();
                    System.out.print("Masukkan harga: ");
                    double harga = scanner.nextDouble();
                    KategoriMenu menu = new KategoriMenu(namaMenu, stok, harga);
                    adminStok.tambahMenu(menu);
                    break;

                case 2:
                    System.out.println("\n=== Daftar Menu ===");
                    adminStok.tampilkanSemuaMenu();
                    break;

                case 3:
                    System.out.print("Masukkan nama menu yang akan dihapus: ");
                    String deleteNamaMenu = scanner.nextLine();
                    adminStok.hapusMenu(deleteNamaMenu);
                    break;

                case 4:
                    System.out.print("Masukkan nama menu yang stoknya akan di-update: ");
                    String updateStokNama = scanner.nextLine();
                    System.out.print("Masukkan stok baru: ");
                    int stokBaru = scanner.nextInt();
                    adminStok.updateStok(updateStokNama, stokBaru);
                    break;

                case 5:
                    System.out.print("Masukkan nama menu yang harganya akan di-update: ");
                    String updateHargaNama = scanner.nextLine();
                    System.out.print("Masukkan harga baru: ");
                    double hargaBaru = scanner.nextDouble();
                    adminStok.updateHarga(updateHargaNama, hargaBaru);
                    break;

                case 6:
                    running = false;
                    System.out.println("Terima kasih telah menggunakan aplikasi manajemen stok.");
                    break;

                default:
                    System.out.println("Opsi tidak valid.");
                    break;
            }
        }
        scanner.close();
    }
}
