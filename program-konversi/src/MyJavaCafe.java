package src;
import java.util.Scanner;

public class MyJavaCafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double BAG_COST = 5.50;
        final int LARGE_BOX_CAPACITY = 20;
        final int MEDIUM_BOX_CAPACITY = 10;
        final int SMALL_BOX_CAPACITY = 5;
        final double LARGE_BOX_COST = 1.80;
        final double MEDIUM_BOX_COST = 1.00;
        final double SMALL_BOX_COST = 0.60;

        System.out.print("Masukkan jumlah kantong yang dipesan: ");
        int jumlahKantong = scanner.nextInt();

        int kotakBesar = jumlahKantong / LARGE_BOX_CAPACITY;
        int sisaKantong = jumlahKantong % LARGE_BOX_CAPACITY;

        int kotakSedang = sisaKantong / MEDIUM_BOX_CAPACITY;
        sisaKantong = sisaKantong % MEDIUM_BOX_CAPACITY;

        int kotakKecil = (sisaKantong + SMALL_BOX_CAPACITY - 1) / SMALL_BOX_CAPACITY; // Round up if there are any bags left

        double totalHargaKantong = jumlahKantong * BAG_COST;
        double totalBiayaKotak = (kotakBesar * LARGE_BOX_COST) + (kotakSedang * MEDIUM_BOX_COST) + (kotakKecil * SMALL_BOX_COST);
        double totalBiaya = totalHargaKantong + totalBiayaKotak;

        System.out.printf("Jumlah paket pesanan: %d - $%.2f%n", jumlahKantong, totalHargaKantong);
        System.out.printf("Box yang dibutuhkan: %d Large - $%.2f%n", kotakBesar, kotakBesar * LARGE_BOX_COST);
        System.out.printf("%d Medium - $%.2f%n", kotakSedang, kotakSedang * MEDIUM_BOX_COST);
        System.out.printf("%d Small - $%.2f%n", kotakKecil, kotakKecil * SMALL_BOX_COST);
        System.out.printf("Biaya total adalah: $%.2f%n", totalBiaya);

        scanner.close();
    }
}
