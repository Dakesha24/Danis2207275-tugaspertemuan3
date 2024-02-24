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
 * Soal 3
 * Menentukan lama bekerja seseorang berdasarkan jam masuk dan jam keluar dengan
asumsi jam hanya 1 sampai dengan 12 dan lama bekerja seorang pegawai kurang dari
12 jam.
 */

import java.util.Scanner;

import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jam masuk: ");
        int jamMasuk = scanner.nextInt();

        System.out.print("Masukkan jam keluar: ");
        int jamKeluar = scanner.nextInt();

        int lamaBekerja = jamKeluar - jamMasuk;

        if (lamaBekerja < 0) {
            lamaBekerja += 12;
        }

        System.out.println("Lama bekerja: " + lamaBekerja + " jam");
    }
}
