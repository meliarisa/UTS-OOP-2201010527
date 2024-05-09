package toko;
import java.util.Scanner;

/**
 *
 * @author melia 2201010527
 * tgl : 2024-05-09
 */

public class Product {
    private String nama;
    private int stok;
    private double harga;

    public Product(String nama, int stok, double harga) {
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    @Override
    public String toString() {
        return "Nama: " + nama + ", Stok: " + stok + ", Harga: " + harga;
    }

    public static Product buatProdukDariInput(Scanner scanner) {
        System.out.print("Nama barang: ");
        String nama = scanner.nextLine();
        System.out.print("Stok: ");
        int stok = scanner.nextInt();
        System.out.print("Harga: ");
        double harga = scanner.nextDouble();
        return new Product(nama, stok, harga);
    }
}
