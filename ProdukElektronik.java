public class ProdukElektronik {
    
public class ProdukElektronik extends Produk {

    int garansiTahun;

    public ProdukElektronik(String nama, double harga,
                            int garansiTahun) {
        super(nama, harga);
        this.garansiTahun = garansiTahun;
    }

    @Override
    public String getInfo() {
        return "Produk: " + nama +
               ", harga: Rp" + harga +
               ", garansi: " + garansiTahun + " tahun";
    }
}

}
