/**
 * File         : PersegiPanjang.java 08/03/2023
 * Penulis      : Yesy Margharetta Munthe
 * Deskripsi    : Representasi dari objek persegi panjang, turunan kelas poligon
 */
 
package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }

    public void printInfo(){
        System.out.println("Bangun Persegi Panjang bersisi "+this.getJumlahSisi());
    }
}