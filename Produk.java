public class produk {
    
public class Produk {
    String nama;
    double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getInfo() {
        return "Produk: " + nama + ", harga: Rp" + harga;
    }
}

}
