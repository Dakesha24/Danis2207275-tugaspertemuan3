/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2207275daniskeysarasaputra_pbo_pert3;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sisi pertama: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan sisi kedua: ");
        int b = scanner.nextInt();

        System.out.print("Masukkan sisi ketiga: ");
        int c = scanner.nextInt();

        boolean isKubus = a == b && b == c;

        if (isKubus) {
            System.out.println("Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
}
