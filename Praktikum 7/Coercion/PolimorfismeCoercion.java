/* 
* PolimorfismeCoercion.java 03/05/2023
* Penulis : Yesy Margharetta Munthe
* NIM : 24060121120031
* Deskripsi : kelas PolimorfismeCoercion yanga dalah contoh coercion
*/

public class PolimorfismeCoercion {
	
	public static int kuadrat(int bilangan){
	return bilangan*bilangan;
	}
	
	public static void main(String[] args){
	//deklarasi objek integer
	Integer bilangan = 10;
	
	//objek integer 'dipaksa' untuk diubah
	//menjadi primitif
	int hasilKuadrat = kuadrat(bilangan);
	
	System.out.printf("Hasil kuadrat %d adalah %d",
			bilangan,
		hasilKuadrat);
	}
}