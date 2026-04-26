package Latihan_2;

import java.util.Scanner;

public class P8_Aprima2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("=== MASUKAN PILIHAN ===");
            System.out.println("1. Masuk Program");
            System.out.println("2. Keluar");
            System.out.print("Pilih: ");
            int pilih = input.nextInt();

            if (pilih == 1) {

                // input
                System.out.print("Masukkan Jumlah Pertemuan : ");
                int realisasi = input.nextInt();

                System.out.print("Masukkan Jumlah Kehadiran : ");
                int hadir = input.nextInt();

                System.out.print("Masukkan Nilai Tugas : ");
                double tugas = input.nextDouble();

                System.out.print("Masukkan Nilai UTS : ");
                double uts = input.nextDouble();

                System.out.print("Masukkan Nilai UAS : ");
                double uas = input.nextDouble();

                // ===== PROSES =====
                double persenHadir = (hadir * 100.0) / realisasi;

                double nilaiAbsen = persenHadir * 0.10;
                double nilaiTugas = tugas * 0.20;
                double nilaiUTS   = uts * 0.30;
                double nilaiUAS   = uas * 0.40;

                double total = nilaiAbsen + nilaiTugas + nilaiUTS + nilaiUAS;

                String grade;

                //
                if (persenHadir < 75) {
                    System.out.println("\n[!] PERINGATAN: Kehadiran di bawah 75% ("
                            + String.format("%.2f", persenHadir)
                            + "%). Dikenakan penalti nilai.");

                    if (total >= 55) {
                        total = 55;
                        grade = "D";
                    } else {
                        grade = "E";
                    }
                } else {
                    if (total >= 80) {
                        grade = "A";
                    } else if (total >= 70) {
                        grade = "B";
                    } else if (total >= 60) {
                        grade = "C";
                    } else if (total >= 55) {
                        grade = "D";
                    } else {
                        grade = "E";
                    }
                }

                // ===== OUTPUT =====
                System.out.println("\n=== HASIL AKHIR ===");
                System.out.printf("Persentase Kehadiran : %.2f%%\n", persenHadir);
                System.out.printf("Total Nilai Akhir    : %.2f\n", total);
                System.out.println("Grade Mahasiswa      : " + grade);
                System.out.println("======================================");

            } else {
                System.out.println("Program selesai. Terima kasih.");
            }

            input.close();
        }
    }