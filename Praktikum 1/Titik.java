/* 
* Titik.java 22/02/2023
* Penulis : Yesy Margharetta Munthe
* NIM : 24060121120031
* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas Titik
*/

class Titik {
  double absis;
  double ordinat;
  static int counterTitik;

  Titik() {
	absis = 0;
	ordinat = 0;
	counterTitik++;
  }

  Titik(double x, double y) {
	absis = x;
	ordinat = y;
	counterTitik++;
  }
 
  Titik(int x, int y) {
	absis = x;
	ordinat = y;
	counterTitik++;
  }

  void setAbsis(double x) {
	absis = x;
  }

  void setOrdinat(double y) {
	ordinat = y;
  }

  double getAbsis() {
	return absis;
  }

  double getOrdinat() {
	return ordinat;
  }

  int getCounterTitik() {
	return counterTitik;
  }

  void printTitik() {
	System.out.println("(" + absis + "," + ordinat + ")");
  }

}
