package Tugas;
import java.util.Scanner;

public class Tugas_p7Aprima {

        public static void main(String args[]) {
            Scanner input = new Scanner(System.in);

            System.out.println("==== PROGRAM TIKET BIOSKOP ====");
            System.out.print("Masukkan umur: ");
            int umur = input.nextInt();
            System.out.print("Pilih Hari: \n1 = Weekend\n0 =Weekday :\n");
            int weekend = input.nextInt();

            if (weekend == 1) {
                // harga pas weekend
                if (umur >= 18) {
                    System.out.println("Harga tiket: Rp50.000");
                } else {
                    System.out.println("Harga tiket: Rp30.000");
                }
            } else {
                // harga pas weekday
                if (umur >= 18) {
                    System.out.println("Harga tiket: Rp35.000");
                } else {
                    System.out.println("Harga tiket: Rp20.000");
                }
            }
        }
    }
