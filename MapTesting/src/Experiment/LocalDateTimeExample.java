package Experiment;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LocalDateTimeExample {
	
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	public static void main(String[] args) {
		
		List<LocalDate> listOfDateRange = getListOfDate();		
		System.out.println("Values are :");
		for (int i=0;i<listOfDateRange.size();i++) {
			System.out.println(listOfDateRange.get(i));
		}
	}
	
	public static List<LocalDate> getListOfDate(){
		
		  LocalDate currentDate = LocalDate.now();		  
		  String formattedCurrentDate = currentDate.format(formatter);
		  System.out.println("The formatted current Date is : "+formattedCurrentDate);	 
		  
		  LocalDate lookBackPeriod = currentDate.minusDays(7);
		  LocalDate lookAheadPeriod = currentDate.plusDays(2);
	    
		  long dataDateRange = ChronoUnit.DAYS.between(lookBackPeriod, lookAheadPeriod);
		  return IntStream.iterate(0, i-> i+1).limit(dataDateRange+1).mapToObj(i -> lookBackPeriod.plusDays(i)).collect(Collectors.toList());
	}

}
