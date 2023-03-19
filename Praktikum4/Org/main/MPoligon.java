/**
 * File         : MPoligon.java 08/03/2023
 * Penulis      : Yesy Margharetta Munthe
 * Deskripsi    : Driver class untuk poligon dan persegi panjang
 */

package org.main;

import org.bangundatar.Segitiga;
import org.bangunruang.LimasSegitiga;

public class MPoligon{
	public static void main(String[] args){
		Segitiga segitiga = new Segitiga(4,5);
		LimasSegitiga limassegitiga = new LimasSegitiga(segitiga);
		System.out.println("Luas Alas Limas Segitiga adalah : "+limassegitiga.hitungLuasAlas());
		System.out.println("Volume Limas Segitiga adalah : "+limassegitiga.hitungVolume());
	}
}