/**
 * File         : MapTest.java 17/05/2023
 * Penulis      : Yesy Margharetta Munthe
 * Deskripsi  : Program yang menggunakan Generic untuk pasangan kunci-nilai
 **/
 
 import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		//kunci-> integer, nilai-> string
		Map<Integer,String> map = new HashMap<Integer,String>();
		//menempatkan elemen kunci dan nilai 
		map.put(1, "satu");
		map.put(2, "dua");
		map.put(3, "tiga");
		map.put(4, "empat");
		map.put(5, "lima");
		//mengambil keseluruhan kunci sebagai objek collection set
		Set<Integer> keys = map.keySet();
		//iterasi untuk mengambil keseluruhan nilai dari kunci
		for(Integer key: keys){
			String value = map.get(key);
			System.out.println(key + " : " + map.get(key));
		}
	}   
}
//tugas:
// 1: satu
// 2: dua
// 3: tiga
// 4: empat
// 5: lima