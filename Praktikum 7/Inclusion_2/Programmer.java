/* 
* Programmer.java 03/05/2023
* Penulis : Yesy Margharetta Munthe
* NIM : 24060121120031
* Deskripsi : kelas Programmer
*/
public class Programmer extends Pegawai {
	private int bonus = 450000;
	
	public  Programmer(String nama){
		super(nama);
	}
	
	public void tampilData(){
		System.out.println("Nama = "+this.nama + ", Gaji Pokok: "+this.gajiPokok + ",Bonus:" + this.bonus);
	}
}