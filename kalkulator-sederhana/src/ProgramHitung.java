import java.util.Scanner;

public class ProgramHitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        int tambah = angka1 + angka2;
        System.out.println("Hasil penjumlahan: " + tambah);

        int kurang = angka1 - angka2;
        System.out.println("Hasil pengurangan: " + kurang);

        int kali = angka1 * angka2;
        System.out.println("Hasil perkalian: " + kali);

        double bagi = (double) angka1 / angka2;
        System.out.println("Hasil pembagian: " + bagi);

        int modulus = angka1 % angka2;
        System.out.println("Sisa bagi: " + modulus);

        scanner.close();
    }
}