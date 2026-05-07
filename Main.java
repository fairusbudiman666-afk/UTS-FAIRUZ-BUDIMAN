//NAMA : FAIRUZ BUDIMAN
//NIM  : 2515101043
public class Main {
    public static void main(String[] args) {
        barang barang1 = new barang("buku", 10000000, 5);
        Transaksi transaksi1 = new Transaksi("John Doe", barang1);
        HasilTransaksi hasilTransaksi1 = (HasilTransaksi) transaksi1.prosesTransaksi();
        hasilTransaksi1.display();
    }
}