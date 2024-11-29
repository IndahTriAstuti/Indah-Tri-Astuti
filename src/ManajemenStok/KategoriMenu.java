package ManajemenStok;

public class KategoriMenu {
    private String namaMenu;
    private int stok;
    private double harga;
    
    public KategoriMenu(String namaMenu, int stok, double harga) {
        this.namaMenu = namaMenu;
        this.stok = stok;
        this.harga = harga;
    }
    
    // Getter dan Setter
    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    // Menampilkan informasi kategori menu
    public void displayMenuInfo() {
        System.out.println("Nama Menu: " + namaMenu);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }
}
