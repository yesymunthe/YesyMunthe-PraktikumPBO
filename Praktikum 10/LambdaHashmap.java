/**
* File: LambdaHashmap.java
* Penulis: Yesy Margharetta Munthe
* NIM: 24060121120031
* Deskripsi: implementasi lambda
*/

import java.util.HashMap;
import java.util.Map;

public class LambdaHashmap{
	public static void main(String[] args){
	Map<String, String> mahasiswa = new HashMap<>();
	mahasiswa.put("24060121120031", "Yesy Margharetta Munthe");
	mahasiswa.put("24060121120051", "Suga");
	mahasiswa.put("24060121120061", "Reno");
	
	mahasiswa.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}