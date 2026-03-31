package Latihan_1;

import java.util.Scanner;

    public class Latihan_1{
        public static void main(String args[]){


            Scanner input = new Scanner(System.in);
            String nama; int usia;

            System.out.print("input nama");
            nama = input.nextLine();

            System.out.println("input age : ");
            usia = input.nextInt();

            System.out.println("==========");
            System.out.println("name : " + nama);
            System.out.println("usia : " + usia);


        }
    }

