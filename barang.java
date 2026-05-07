public class barang {
    String nama;
    int harga;
    int stok;

    public barang(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;       
    }

    public barang(int harga, String nama, int stok) {
        this.harga = harga;
        this.nama = nama;
        this.stok = stok;
    }

    public void display() {
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga Barang: " + harga);
        System.out.println("Stok Barang: " + stok);
    }

    public int getStok() {
        return stok;
    }
}