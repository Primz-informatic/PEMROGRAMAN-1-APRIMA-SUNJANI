package Latihan_1;

import java.util.Scanner;

public class Aprima_P4 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("=== Program Penghitung Nilai Mahasiswa ===");

            // input jumlah presensi
            System.out.print("Masukkan Realisasi Pertemuan: ");
            float kehadiran = input.nextFloat();
            System.out.print("Masukkan Jumlah Kehadiran: ");
            float realisasi = input.nextFloat();

            // input nilai tugas, UTS, UAS
            System.out.print("Masukkan Nilai Tugas: ");
            float nilaiTugas = input.nextFloat();
            System.out.print("Masukkan Nilai UTS: ");
            float nilaiUTS = input.nextFloat();
            System.out.print("Masukkan Nilai UAS: ");
            float nilaiUAS = input.nextFloat();

            //presensi
            float totalPresensi = (kehadiran/realisasi) * 10 / 100;

            //tugas
            float totalTugas = nilaiTugas * 20 / 100;

            //UTS
            float totalUTS = nilaiUTS * 30 / 100;

            //UAS
            float totalUAS = nilaiUAS * 40 / 100;

            // hasil akhir
            float hasil = totalPresensi + totalTugas + totalUTS + totalUAS;

            // Output
            System.out.println("\n=== Rincian Nilai ===\n");
            System.out.println("Total Presensi: " + totalPresensi);
            System.out.println("Total Tugas: " + totalTugas);
            System.out.println("Total UTS: " + totalUTS);
            System.out.println("Total UAS: " + totalUAS);
            System.out.println("Hasil: " + hasil);

            input.close();
        }
    }