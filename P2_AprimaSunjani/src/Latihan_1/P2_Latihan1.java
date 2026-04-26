package Latihan_1;

import java.util.Scanner;

    public class P2_Latihan1 {
            public static void main(String args[]) {
                Scanner input = new Scanner(System.in);
                String nama, universitas;
                int usia;

                System.out.print("Input nama: ");
                nama = input.nextLine();

                System.out.print("Input usia: ");
                usia = input.nextInt();
                input.nextLine();

                System.out.print("Input universitas: ");
                universitas = input.nextLine();

                System.out.println("Aku " + nama);
                System.out.println("Usia Aku: " + usia);
                System.out.println("Aku mahasiswa di " + universitas);
            }
        }

