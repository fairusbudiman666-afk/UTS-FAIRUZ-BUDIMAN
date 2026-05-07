public class HasilTransaksi {
    String namaPembeli;
    String namaBarang;
    int hargaBarang;

    public HasilTransaksi(String namaPembeli, String namaBarang, int hargaBarang) {
        this.namaPembeli = namaPembeli;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    public void display() {
        System.out.println("Nama Pembeli: " + namaPembeli);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
    }
}