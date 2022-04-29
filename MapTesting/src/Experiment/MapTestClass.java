package Experiment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTestClass {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("Shreya", 777);
		hm.put("Vysakh", 110);
		hm.put("Ankit", 880);
		hm.put("Khyatee", 246);
		
		int timeZ =  Integer.parseInt("+0530")/100*3600*1000+Integer.parseInt("+0530")%100*60*1000;
		System.out.println("Printing TIME INT : "+timeZ);
		String res = dateToDate();
		System.out.println("Printing date to date result : " + res);
		
		
		Iterator<Map.Entry<String, Integer>> iterator = hm.entrySet().iterator();
		
		
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> hashMap = iterator.next();
			System.out.println("Printing the key and value pair : "+hashMap.getKey()+" and "+hashMap.getValue());
		}
		
	
		}
	
	public static String dateToDate() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
		Date date = null;
		
		try {
			date = sdf.parse("2022-04-0615:52:58");
			
		}catch(ParseException e) {
			System.out.println(e.getMessage());
		}
		calendar.setTime(date);
		sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		return sdf.format(date.getTime() - 19800000);
	}

}
