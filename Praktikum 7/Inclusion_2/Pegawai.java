/* 
* Pegawai.java 03/05/2023
* Penulis : Yesy Margharetta Munthe
* NIM : 24060121120031
* Deskripsi : kelas Pegawai
*/
public class Pegawai{
   protected String nama;
   protected int gajiPokok = 5000000;
   
   public Pegawai(String nama){
	   this.nama = nama;
   }
   public void setNama(String nama) {
	   this.nama = nama;
   }
   
   public void tampilData(){
		System.out.println("Nama = "+ this.nama + ", Gaji Pokok: "+this.gajiPokok);
   }
}   

