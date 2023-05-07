/* 
* Bus.java 03/05/2023
* Penulis : Yesy Margharetta Munthe
* NIM : 24060121120031
* Deskripsi : kelas Bus
*/
public class Bus extends Vehicle {
	void calRent(int jarak, float harga) {
		float fare=jarak*harga;
		fare=fare-50.00f;
		System.out.println("harga sewa Bus = "+fare);
	}
		
}