/**
 * File         : Poligon.java 08/03/2023
 * Penulis      : Yesy
 * Deskripsi    : Representasi dasar dari objek poligon (segi banyak)
 */
 
package org.poligon; 
 
public class Poligon{ 
	protected int jumlahSisi; 
	public Poligon(){ 
		this.jumlahSisi = 0; 
	} 
	
	public int getJumlahSisi(){ 
		return this.jumlahSisi; 
	} 
	
	public void setJumlahSisi(int sisi){ 
		this.jumlahSisi = sisi; 
	} 
}
