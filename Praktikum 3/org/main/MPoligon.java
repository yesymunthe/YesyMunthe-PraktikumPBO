/**
 * File         : MPoligon.java 08/03/2023
 * Penulis      : Yesy Margharetta Munthe
 * Deskripsi    : Driver class untuk poligon dan persegi panjang
 */

package org.main;

import org.bangundatar.*;

public class MPoligon{
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		Segitiga segitiga = new Segitiga(8,6,10,3);
		persegi.printInfo();
        System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
        segitiga.printInfo();
        System.out.println("Panjang Sisi Miring adalah : "+segitiga.Pythagoras());
        
    }
}