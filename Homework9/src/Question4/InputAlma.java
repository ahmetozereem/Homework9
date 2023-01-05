package Question4;

import java.util.Scanner;

public class InputAlma {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis(); 
		StringBuilder name = new StringBuilder();
		StringBuilder tcKimlik = new StringBuilder();
		StringBuilder kKarti = new StringBuilder();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Adınızı ve soyadınızı giriniz");
			
		name.append (scan.nextLine());
		
		System.out.println("Hoşgeldiniz "+ name);
		
		System.out.println("Kimlik Numaranızı giriniz");
		
		tcKimlik.append (scan.nextLine());//
		
			
		System.out.println("TC Dogru mu? "+ tcKimlik.replace(1,3,"**").replace(4, 8, "****").replace(9, 11, "***"));
		
		System.out.println("Dogruysa enter e basınız");
		
		scan.nextLine();
		
		
		
		System.out.println("Kredi kartı numaranızı yazınız");
			
		kKarti.append (scan.nextLine());
		
		System.out.println("Kredi Kartı No: "+ kKarti.replace(0,12,"************"));
		
		long endTime = System.currentTimeMillis();
		
		long estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
		double seconds = (double)estimatedTime/1000; // saniyeye çevirmek için 1000'e bölüyoruz.
		System.out.println("“Islemler " +seconds+" surede tamamlandi.");
		
		
	}

}
