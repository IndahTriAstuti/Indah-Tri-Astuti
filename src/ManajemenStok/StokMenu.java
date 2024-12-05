package ManajemenStok;

import java.awt.List;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.Menu;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "stok_menu")
public class StokMenu  implements java.io.Serializable {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_menu", unique = true, nullable = false)
    private Integer idMenu;

    @Column(name = "nama_menu", nullable = false)
    private String namaMenu;

    @Column(name = "jumlah_stok", nullable = false)
    private int jumlahStok;

    @Column(name = "harga", nullable = false)
    private int harga;

    public StokMenu() {
    }

    public StokMenu(String namaMenu, int jumlahStok, int harga) {
       this.namaMenu = namaMenu;
       this.jumlahStok = jumlahStok;
       this.harga = harga;
    }

    public StokMenu(String idMenu, String namaMenu, String jmlhStok, String harga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public Integer getIdMenu() {
        return this.idMenu;
    }
    
    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }
    public String getNamaMenu() {
        return this.namaMenu;
    }
    
    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }
    public int getJumlahStok() {
        return this.jumlahStok;
    }
    
    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }
    public int getHarga() {
        return this.harga;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public static java.util.List<StokMenu> read() {
            java.util.List<StokMenu> a = new ArrayList<StokMenu>();
            Session session = Menu.getSessionFactory().openSession();
    Transaction transaction = null;

    try {
        transaction = session.beginTransaction();
        StokMenu menu = new StokMenu("Nasi Goreng", 10, 20000);
        session.save(menu);
        transaction.commit(); // Commit untuk menyimpan perubahan ke database
    } catch (RuntimeException e) {
        if (transaction != null) {
            transaction.rollback(); // Rollback jika terjadi kesalahan
        }
        e.printStackTrace();
    } finally {
        session.close();
    }
        return a;
    }



}


