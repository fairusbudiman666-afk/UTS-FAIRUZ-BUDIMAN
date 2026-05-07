public class Transaksi {
    String namaPembeli;
    barang barang;

    public Transaksi(String namaPembeli, barang barang) {
        this.namaPembeli = namaPembeli;
        this.barang = barang;
    }

    public HasilTransaksi prosesTransaksi() {
        return new HasilTransaksi(namaPembeli, barang.nama, barang.harga);
    }
}