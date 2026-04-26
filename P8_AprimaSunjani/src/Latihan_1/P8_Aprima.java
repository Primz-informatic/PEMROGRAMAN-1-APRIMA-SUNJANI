package Latihan_1;

import java.util.Scanner;

public class P8_Aprima {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Looping");

        // forS
        System.out.print("Berapa angka yang mau di cetak: ");
        int batasAngka = input.nextInt();
        for(int i = 1; i <= batasAngka; i++){
            System.out.print("\nNilai ke-" + i);
        }
        input.close();
    }
}