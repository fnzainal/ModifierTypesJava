package paketSatu;
/**
 * 
 * Modifier Types on Java
 * @writer Zainal Fahrudin
 * Pondok Programmer, 16 Oct 2015
 */
import paketDua.Angka;

public class Bilangan {

	public static void main(String args[]){
		Angka noer = new Angka();
		
		System.out.println(noer.week); //bisa mengakses week karena public
		System.out.println(noer.printWeek()); //bisa mengakses method printWeek() karena public
	}
	
}
