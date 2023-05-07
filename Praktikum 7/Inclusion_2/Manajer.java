/* 
* Manajer.java 03/05/2023
* Penulis : Yesy Margharetta Munthe
* NIM : 24060121120031
* Deskripsi : kelas Manajer
*/
public class Manajer extends Pegawai {
	private int tunjangan = 700000;
	
	public Manajer(String nama) {
		super(nama);
	}
	public void tampilData(){
		System.out.println("Nama = "+ this.nama + ", Gaji Pokok: "+ this.gajiPokok + ",Tunjangan:" + this.tunjangan);
	}
}
	
	
	
