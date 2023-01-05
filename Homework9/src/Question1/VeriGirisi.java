package Question1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class VeriGirisi {

	/*
	 * 1. Tokyo-Kahire arasi ucak seferi duzenleyen bir hava yolu sirketi icin bilet
	 * satis programina bir ek program yazmaniz istendi. Kalkis Tokyo ve inis Kahire
	 * sehridir. Sartlar; Kullanicidan seyahat tarihi ve saati istenecek, Tokyo
	 * saatiyle kalkis saati ve tarihi, Kahire saatiyle inis saati ve tarihi
	 * verilecek. (Kullanicidan istenilen bilgileri “VeriGirisi” adiyla olusturulmus
	 * class’ tan alinip “Sonuc” adiyla olusturulmus class icinde olusturacaginiz
	 * static bir method’ tan kullaniciya sunulacaktir.)
	 * 
	 * japonya kahire arası 12 saat
	 */
	
	public static int [] getDate () {
		
		Scanner scan = new Scanner(System.in);
		
		int [] date = new int [3];
				
		String [] frage = {"Yılı Giriniz: ","Ayı Giriniz: ","Günü Giriniz: "};
		
		System.out.println("Bilet gününü, ayını ve yılını giriniz");
		
		for(int i=0; i<date.length;i++) {
			
			System.out.println(frage[i]);
			
			date [i]=scan.nextInt();
								
		}
		
		return date;
		
	}
	
	public static int [] getTime () {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bilet Saatini ve Dakikasını giriniz");
		
		int [] time = new int [2];
		
		String [] frage = {"Saati Giriniz: ","Dakikayı Giriniz: "};
		
		
		
		for(int i=0; i<time.length;i++) {
			
			System.out.println(frage[i]);
			
			time [i]=scan.nextInt();
								
		}
		
		return time;
		
	
	}
	

}



