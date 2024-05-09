package toko;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author melia 2201010527
 * tgl : 2024-05-09
 */

public class ShopManager {
    private ArrayList<Product> products;

    public ShopManager() {
        this.products = new ArrayList<>();
    }

    public void tambahProduk(String nama, int stok, double harga) {
        Product produkBaru = new Product(nama, stok, harga);
        products.add(produkBaru);
        System.out.println("Produk berhasil ditambahkan.");
    }

    public void tampilkanStok() {
        if (products.isEmpty()) {
            System.out.println("Stok toko kosong.");
        } else {
            System.out.println("=== Stok Produk ===");
            for (Product produk : products) {
                System.out.println(produk);
            }
        }
    }

    public void ubahHarga(String namaProduk, double hargaBaru) {
        Product produkDitemukan = cariProduk(namaProduk);
        if (produkDitemukan != null) {
            produkDitemukan.setHarga(hargaBaru);
            System.out.println("Harga produk berhasil diubah.");
        } else {
            System.out.println("Produk tidak ditemukan.");
        }
    }

    public void hapusProduk(String namaProduk) {
        Product produkDihapus = cariProduk(namaProduk);
        if (produkDihapus != null) {
            products.remove(produkDihapus);
            System.out.println("Produk " + namaProduk + " berhasil dihapus.");
        } else {
            System.out.println("Produk tidak ditemukan.");
        }
    }

    private Product cariProduk(String namaProduk) {
        for (Product produk : products) {
            if (produk.getNama().equalsIgnoreCase(namaProduk)) {
                return produk;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShopManager pengelolaToko = new ShopManager();

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("=== Menu ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Stok");
            System.out.println("3. Ubah Harga");
            System.out.println("4. Hapus Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Nama barang: ");
                    String namaBarang = scanner.nextLine();
                    System.out.print("Stok: ");
                    int stok = scanner.nextInt();
                    System.out.print("Harga: ");
                    double harga = scanner.nextDouble();
                    pengelolaToko.tambahProduk(namaBarang, stok, harga);
                    break;
                case 2:
                    pengelolaToko.tampilkanStok();
                    break;
                case 3:
                    System.out.print("Nama barang yang akan diubah harganya: ");
                    String namaBarangUpdate = scanner.nextLine();
                    System.out.print("Harga baru: ");
                    double hargaBaru = scanner.nextDouble();
                    pengelolaToko.ubahHarga(namaBarangUpdate, hargaBaru);
                    break;
                case 4:
                    System.out.print("Nama barang yang akan dihapus: ");
                    String barangDihapus = scanner.nextLine();
                    pengelolaToko.hapusProduk(barangDihapus);
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
        scanner.close();
    }
}