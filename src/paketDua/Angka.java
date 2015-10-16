package paketDua;

public class Angka {

	int day = 1; //hanya bisa diakses oleh sub"class yang masih satu paket dengannya
	private int year = 365; //hanya bisa diakses oleh classnya sendiri
	protected int month = 31; //hanya bisa diakses oleh sub" class yang masih satu paket dengannya
	public int week = 7; //bisa diakses public
	 
	public int printWeek(){
		return week+day+month+year;
	}
}
