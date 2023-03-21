/**
 * File         : Segitiga.java 08/03/2023
 * Penulis      : Yesy Margharetta Munthe
 * Deskripsi    : Representasi dari objek persegi panjang, turunan kelas poligon
 */
 
package org.bangundatar; 
 
import org.poligon.Poligon; 

public class Segitiga extends Poligon{
	
	private double PanjangSisi;
	private double Tinggi;
	
		public Segitiga(double panjangSisi, double tinggi){
			this.jumlahSisi = 3;
			this.PanjangSisi = panjangSisi;
			this.Tinggi = tinggi;
		}
		
		public double hitungLuas(){
			return 1/2 * PanjangSisi * Tinggi;
		}
		
		public double getPanjangSisi(){
			return this.PanjangSisi;
		}
		
		public double getTinggi(){
			return this.Tinggi;
		}
}