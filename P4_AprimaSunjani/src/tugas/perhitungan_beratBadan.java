package tugas;
import java.util.Scanner;

public class perhitungan_beratBadan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiCm = input.nextDouble();

        // Konversi tinggi ke meter
        double tinggiM = tinggiCm / 100;

        // Hitung BMI
        double bmi = berat / (tinggiM * tinggiM);

        // Output hasil
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("BMI Anda: " + bmi);

        // Kategori BMI
        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Kategori: Normal");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Kategori: Kelebihan berat badan");
        } else {
            System.out.println("Kategori: Obesitas");
        }

        input.close();
    }
}