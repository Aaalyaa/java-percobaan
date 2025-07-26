package src;
import java.util.Scanner;

public class KonversiSuhu {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Pilih jenis konversi:");
            System.out.println("1. Celcius ke Fahrenheit");
            System.out.println("2. Fahrenheit ke Celcius");
            int pilihan = scanner.nextInt();
    
            if (pilihan == 1) {
                System.out.print("Masukkan suhu dalam derajat Celcius: ");
                int celcius = scanner.nextInt();
                float fahrenheit = (float) (1.8 * celcius + 32);
                System.out.println("Suhu dalam derajat Fahrenheit adalah: " + fahrenheit);
            } else if (pilihan == 2) {
                System.out.print("Masukkan suhu dalam derajat Fahrenheit: ");
                float fahrenheit = scanner.nextFloat();
                int celcius = (int) ((fahrenheit - 32) * 5 / 9);
                System.out.println("Suhu dalam derajat Celcius adalah: " + celcius);
            } else {
                System.out.println("Pilihan tidak valid");
            }
    
            scanner.close();
        }
}