/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author user
 * Nama  : Andhyka Widariyanto
 * NIM   : 10117185
 * Kelas : PBO Ulang
 * Tugas : Latihan 46 - Tandanya Kamu
 */
public class PBOUlang10117185Latihan46TandanyaKamu {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Age umur = new Age(2018);
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Masukan Tahun Lahir Anda : ");
            umur.setYearBirth(masukan.nextInt());
        
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun Lahir Anda : "+umur.getYearBirth(0));
        System.out.println("Hari Ini Tahun : " +umur.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah : "+umur.hitungUmur()+" Tahun");
        System.out.println("Tandanya Kamu : "+umur.tandanyaKamu(umur.hitungUmur()));
        
    }
    
}
