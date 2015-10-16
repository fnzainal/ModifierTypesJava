package paketSatu;

import paketDua.Angka;

public class Bilangan {

	public static void main(String args[]){
		Angka noer = new Angka();
		
		System.out.println(noer.week); //bisa mengakses week karena public
		System.out.println(noer.printWeek()); //bisa mengakses method printWeek() karena public
	}
	
}
