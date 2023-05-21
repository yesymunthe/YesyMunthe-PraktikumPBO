/**
 * File         : BangunDatarGeneric.java 17/05/2023
 * Penulis      : Yesy Margharetta Munthe
 * Deskripsi  : Kelas konstruksi generic untuk BangunDatar
 */

public class BangunDatarGeneric<T2 extends BangunDatar>{
	private T2 bangunDatar;
	
	public void set(T2 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T2 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
	//Kesimpulan:
	//Dengan mengganti T menjadi T2 adalah suatu cara untuk memberi nama parameter generic yang lebih deskriptif 
	//sehingga memudahkan dalam membedakan penggunaanya jika terdapat lebih dari satu parameter generik dalam kelas tersebut
	//penggantian ini hanya berfungsi mengganti nama parameter dan tidak akan mempengaruhi cara kerjanya.
}