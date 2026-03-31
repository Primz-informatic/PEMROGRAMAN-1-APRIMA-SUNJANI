package Latihan_1;

import java.util.Scanner;

public class Aprima_P4 {
    public static void main(String args[]){
        float total;

        Scanner input = new Scanner(System.in);

        System.out.println("input Realisasi : ");
        float realisasi = input.nextFloat();

        System.out.println("input kehadiran : ");
        float kehadiran = input.nextFloat();

        System.out.println("input Tugas : ");
        float tugas    = input.nextFloat();

        System.out.println("input UTS : ");
        float uts      = input.nextFloat();

        System.out.println("input UAS : ");
        float uas   = input.nextFloat();


        // Perhitungan (bobot)
        total = (0.10f * kehadiran) +
                (0.20f * tugas) +
                (0.30f * uts) +
                (0.40f * uas);

        System.out.println("\n===== HASIL =====");
        System.out.println("Nilai Akhir   : " + total);

    }
}