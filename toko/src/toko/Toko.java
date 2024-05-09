package toko;
import java.util.Scanner;

/**
 *
 * @author melia 2201010527
 * tgl : 2024-05-09
 */

public class Toko {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PengelolaToko pengelolaToko = new PengelolaToko();

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("~~~~~ Menu ~~~~~");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Stok");
            System.out.println("3. Ubah Harga");
            System.out.println("4. Hapus Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

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

class PengelolaToko {
    public void tambahProduk(String namaBarang, int stok, double harga) {
        System.out.println("Menambahkan " + namaBarang + " ke dalam toko dengan stok " + stok + " dan harga " + harga);
    }

    public void tampilkanStok() {
        System.out.println("Menampilkan stok toko...");
    }

    public void ubahHarga(String namaBarang, double hargaBaru) {
        System.out.println("Mengubah harga " + namaBarang + " menjadi " + hargaBaru);
    }

    public void hapusProduk(String namaBarang) {
        System.out.println("Menghapus " + namaBarang + " dari toko.");
    }
}