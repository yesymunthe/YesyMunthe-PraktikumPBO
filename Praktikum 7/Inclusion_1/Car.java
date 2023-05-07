/* 
* Car.java 03/05/2023
* Penulis : Yesy Margharetta Munthe
* NIM : 24060121120031
* Deskripsi : kelas Car
*/
public class Car extends Vehicle{
	void calRent(int jarak, float harga) {
		float fare=jarak*harga;
		fare=fare-100.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}