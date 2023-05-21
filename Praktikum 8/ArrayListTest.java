/**
 * File         : ArrayListTest.java 17/05/2023
 * Penulis      : Yesy Margharetta Munthe
 * Deskripsi  :Program penggunaan objek ArrayList sebagai collection class
 */

import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("praktikum");
		strings.add("collection");
		strings.add("dan generics");
		strings.remove("praktikum");
		for(String s: strings){
			System.out.print(s+" ");
		}
	}
}