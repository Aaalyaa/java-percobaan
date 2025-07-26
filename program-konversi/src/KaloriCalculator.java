package src;
import java.util.Scanner;

public class KaloriCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan berat badan Anda dalam pon: ");
        int beratBadan = scanner.nextInt();

        int kalori = beratBadan * 19;

        System.out.println("Jumlah kalori yang dibutuhkan dalam sehari adalah: " + kalori);
        
        scanner.close();
    }
}