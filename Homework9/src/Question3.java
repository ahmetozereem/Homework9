import java.util.Scanner;

public class Question3 {
	
	public static void mean(String name,int... notlar) {
		
		Scanner scan = new Scanner(System.in);
		
		notlar = new int [6];
				
		name = new String ();
		
		System.out.println("Ders adını giriniz");
		
		name =scan.nextLine();
		
		String [] frage = {"Vize1: ","Vize2: ","Final: ","Sozlu1: ","Sozlu2: ","Sozlu3: "};
		
		System.out.println("Sırasıyla Vize1, Vize 2, Final, Sozlu1, Sozlu1 ve Sozlu3 notlarını giriniz ");
		
		for(int i=0; i<frage.length;i++) {
			
		System.out.println(frage[i]);
			
		 notlar [i]=scan.nextInt();
										
		}
		
		double ortalama = (((notlar [0]+notlar [1])/2)*30/100)+ (notlar [2]/2)+(((notlar [3]+ notlar [4]+notlar [5])/3)/5);
		
		
		
		System.out.println(name+ "  Dersinin not ortalaması: "+ ortalama);
	}

	public static void main(String[] args) {

		int [] notlar = new int [6];
		
		String name = new String ();
		
		mean(name, notlar);
		
		
	}

}
