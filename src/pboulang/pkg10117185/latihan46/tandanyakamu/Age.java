/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan46.tandanyakamu;

/**
 *
 * @author user
 * Nama  : Andhyka Widariyanto
 * NIM   : 10117185
 * Kelas : PBO Ulang
 * Tugas : Latihan 46 - Tandanya Kamu
 */
public class Age {
    //Atribute
    int yearBirth;
    int yearNow;
    String red = "\033[31m";
    
    //Function
    Age(int yearNow){
       this.yearNow = yearNow; 
    }

    public int getYearBirth(int nextInt) {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    public int hitungUmur(){
        return yearNow-yearBirth;
    }
    public String tandanyaKamu(int umur){
        if ((0<=umur)&&(umur<=5)){
            red += red+"Lagi Lucu-Lucunya";
        }
        else if ((5<umur)&&(umur<=10)){
            red += red+"Masih Anak-anak";
        }
        else if ((10<umur)&&(umur<=13)){
            red += red+"Masih Remadja";
        }
        else if ((13<umur)&&(umur<=19)){
            red += red+"Alay";
        }
        else if ((19<umur)&&(umur<=29)){
            red += red+"Lagi Galau nyari jodoh";
        }
        else if ((29<umur)&&(umur<=35)){
            red += red+"Lagi Sibuk nyari uang";
        }
        else if ((35<umur)&&(umur<=150)){
            red += red+"Sudah Tua";
        }
        else {
            red +="Tidak Terdeteksi di Kehidupan";
        }
        return red;
    }
    
}
