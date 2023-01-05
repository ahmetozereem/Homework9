package Question1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Sonuc {
	
	public static void getDateTime () {
		
		VeriGirisi verigir = new VeriGirisi ();
		
		int date1 [] = verigir.getDate();
					
		//LocalDate date = LocalDate.of(date1[0], date1[1], date1[2]);
					
		int time1 [] = verigir.getTime();
				
		//LocalTime time = LocalTime.of(time1 [0], time1 [1]);
				
		
		LocalDateTime dateTime = LocalDateTime.of(date1[0], date1[1], date1[2],time1 [0], time1 [1] );// bu saat Japonya uçak kalkıs saati
		
		ZoneId  tokyo = ZoneId.of("Asia/Tokyo");
		 
		ZonedDateTime zoneTokyo  = ZonedDateTime.of(dateTime, tokyo);
		
		System.out.println("Tokyo kalkış saati" + "\t"+": " + zoneTokyo); 
		 
			
		ZoneId  cairo = ZoneId.of("Africa/Cairo");
		 
		ZonedDateTime zoneKairo  = zoneTokyo.withZoneSameInstant(cairo);
		 
		System.out.println("Kahire varış saati" + "\t"+": " + zoneKairo.plusHours(12));
		
	}

	public static void main(String[] args) {

		getDateTime();
			
		}

}
