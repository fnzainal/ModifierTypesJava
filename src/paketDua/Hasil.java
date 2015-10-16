package paketDua;

public class Hasil {
	
	public static void main(String args[]){
		
		Angka satu = new Angka();
		
		System.out.println(satu.day); //bisa mengakses day karena default & masih satu paket
		System.out.println(satu.month); //bisa mengakses month karena protected & masih satu paket
		System.out.println(satu.week);//bisa mengakses week karena public
		System.out.println(satu.printWeek()); //bisa mengakses method printWeek() karena public
	}

}
