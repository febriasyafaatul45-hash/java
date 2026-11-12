public class MainProkduk {
    
public class MainProduk {
    public static void main(String[] args) {

        Produk produk1 = new Produk("Buku", 50000);

        ProdukElektronik produk2 =
            new ProdukElektronik("Laptop", 10000000, 2);

        System.out.println(produk1.getInfo());
        System.out.println(produk2.getInfo());
    }
}

}
