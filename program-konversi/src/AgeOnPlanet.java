package src;
import java.util.Scanner;

public class AgeOnPlanet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan usia Anda di Bumi: ");
        float usiaBumi = scanner.nextFloat();

        final double MERKURIUS_DAYS = 88.0;
        final double VENUS_DAYS = 225.0;
        final double JUPITER_DAYS = 4380.0;
        final double SATURNUS_DAYS = 10767.0;

        double usiaMerkurius = (usiaBumi * 365) / MERKURIUS_DAYS;
        double usiaVenus = (usiaBumi * 365) / VENUS_DAYS;
        double usiaJupiter = (usiaBumi * 365) / JUPITER_DAYS;
        double usiaSaturnus = (usiaBumi * 365) / SATURNUS_DAYS;

        System.out.println("Usia Anda di Merkurius: " + usiaMerkurius + " tahun");
        System.out.println("Usia Anda di Venus: " + usiaVenus + " tahun");
        System.out.println("Usia Anda di Jupiter: " + usiaJupiter + " tahun");
        System.out.println("Usia Anda di Saturnus: " + usiaSaturnus + " tahun");

        scanner.close();
    }

}
