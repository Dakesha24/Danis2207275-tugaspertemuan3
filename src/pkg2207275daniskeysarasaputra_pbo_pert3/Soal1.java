/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2207275daniskeysarasaputra_pbo_pert3;

/**
 *
 * Nama : Danis Keysara Saputra
 * NIM  : 2207275
 * Pendidikan Ilmu Komputer 4A
 * 
 * Soal 1
 * Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah karakter, periksa
apakah karakter memiliki urutan konsonan-vokal-konsonan (masukan adalah sebuah
huruf dan merupakan huruf kecil)
 * 
 */

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan karakter pertama: ");
        char a = scanner.next().charAt(0);

        System.out.print("Masukkan karakter kedua: ");
        char b = scanner.next().charAt(0);

        System.out.print("Masukkan karakter ketiga: ");
        char c = scanner.next().charAt(0);

        boolean isKonsonanVokalKonsonan = isKonsonan(a) && isVokal(b) && isKonsonan(c);

        if (isKonsonanVokalKonsonan) {
            System.out.println("Urutan karakter " + a + " - " + b + " - " + c + " adalah konsonan - vokal - konsonan.");
        } else {
            System.out.println("Urutan karakter " + a + " - " + b + " - " + c + " bukan konsonan - vokal - konsonan.");
        }
    }

    private static boolean isKonsonan(char karakter) {
        return karakter >= 'a' && karakter <= 'z' && !"aeiou".contains(String.valueOf(karakter));
    }

    private static boolean isVokal(char karakter) {
        return "aeiou".contains(String.valueOf(karakter));
    }
}

