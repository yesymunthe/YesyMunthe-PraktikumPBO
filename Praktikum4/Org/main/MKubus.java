/**
 * File         : MKubus.java 20/03/2023
 * Penulis      : Yesy Margharetta Munthe
 * Deskripsi    : Driver class untuk Kubus
 */
package org.main; 
 
import org.bangunruang.*; 
import org.bangundatar.*; 
 
public class MKubus{ 
	public static void main(String[] args){ 
		BujurSangkar bujurSangkar = new BujurSangkar(4); 
		Kubus kubus = new Kubus(bujurSangkar); 
		System.out.println("Luas Alas Kubus dengan panjang sisi 4 satuan : "+kubus.hitungLuasAlas()); 
		System.out.println("Volume Kubus dengan panjang sisi 4 satuan : "+kubus.hitungVolume()); 
	} 
}