package Question2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class BirthDate {
	
	/*
	 * Kullanicidan dogum tarihini isteyin ve yasini; a) Gun, ay, yil olarak
	 * yasHesapla() static void metodu’ nda, b) Sade ay olarak ay() non-static void
	 * metodu’ nda, c) Sadece gun olarak gun() non-static String donuslu method’
	 * unda, hesaplayiniz.
	 */

	static void yasHesapla () {
		
		Scanner scan = new Scanner(System.in);
		
		int [] date = new int [3];
				
		String [] frage = {"Yılı Giriniz: ","Ayı Giriniz: ","Günü Giriniz: "};
		
		System.out.println("Dogum Tarihinizi yıl, ay ve gün olarak sırayla giriniz");
		
		for(int i=0; i<date.length;i++) {
			
			System.out.println(frage[i]);
			
			date [i]=scan.nextInt();
								
		}
		
		//System.out.println(date);
		LocalDate date1 = LocalDate.of(date[0], date[1], date[2]);
		
		LocalDate dateNow = LocalDate.now();
		
		int [] yas= new int [3]; 
		
		yas [0]=Period.between(date1,dateNow).getYears();
		yas [1]=Period.between(date1,dateNow).getMonths();
		yas [2]=Period.between(date1,dateNow).getDays();
		
		System.out.print("Yasınız: yıl: "+ yas [0]+"  Ay: "+ yas [1]+"  Gün: "+ yas [2]);
		
		
		
	}
	
	public void ay () {
		Scanner scan = new Scanner(System.in);
		
		int [] date = new int [3];
				
		String [] frage = {"Yılı Giriniz: ","Ayı Giriniz: ","Günü Giriniz: "};
		
		System.out.println("Dogum Tarihinizi yıl, ay ve gün olarak sırayla giriniz");
		
		for(int i=0; i<date.length;i++) {
			
			System.out.println(frage[i]);
			
			date [i]=scan.nextInt();
								
		}
		
		//System.out.println(date);
		LocalDate date1 = LocalDate.of(date[0], date[1], date[2]);
		
		LocalDate dateNow = LocalDate.now();
		
		int [] yas= new int [3]; 
		
		yas [0]=Period.between(date1,dateNow).getYears();
		yas [1]=Period.between(date1,dateNow).getMonths();
		yas [2]=Period.between(date1,dateNow).getDays();
		
		System.out.print("Yasınız: Ay : "+ yas [0]*12+yas [1]);
		
	}
	
	public String gun () {
		Scanner scan = new Scanner(System.in);
		
		int [] date = new int [3];
				
		String [] frage = {"Yılı Giriniz: ","Ayı Giriniz: ","Günü Giriniz: "};
		
		System.out.println("Dogum Tarihinizi yıl, ay ve gün olarak sırayla giriniz");
		
		for(int i=0; i<date.length;i++) {
			
			System.out.println(frage[i]);
			
			date [i]=scan.nextInt();
								
		}
		
		//System.out.println(date);
		LocalDate date1 = LocalDate.of(date[0], date[1], date[2]);
		
		LocalDate dateNow = LocalDate.now();
		
		int [] yas= new int [3]; 
		
		yas [0]=Period.between(date1,dateNow).getYears();
		yas [1]=Period.between(date1,dateNow).getMonths();
		yas [2]=Period.between(date1,dateNow).getDays();
		
		int gunToplam =yas [0]*12*30+yas [1]*30+yas [2];
		
		String guntoplam2 = String.valueOf(gunToplam);
		
		//System.out.print("Yasınız: Ay : "+ yas [0]*12*30+yas [1]*30+yas [2]);
		
		return guntoplam2;
		
	}
	public static void main(String[] args) {
		
		//a
		//yasHesapla ();
		
		//b
		//BirthDate date = new BirthDate ();
		//date.ay ();
		
		//c
		
		BirthDate date = new BirthDate ();
		String gun = date.gun();
		
		System.out.println(gun);
		
			
	}

}
