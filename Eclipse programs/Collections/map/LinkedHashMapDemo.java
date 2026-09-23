package map;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Double> lhm = new LinkedHashMap<String, Double>();
		
		lhm.put("Deepender", 2023.34);
		lhm.put("Sam", 5000.35);
		lhm.put("Satya", 4509.34);
		lhm.put("Sundar", 4536.56);
		lhm.put("Tim", 7934.34);
		
		//LinkedHashMap also allow one null Key and multiple null values.
		lhm.put(null, null);
		lhm.put("Elon", null);
		lhm.put("Bezos", null);
		
		
		Set<String> keys = lhm.keySet();
		
		for(String CEO : keys) {
			System.out.println("Salary of CEO "+CEO+" is "+lhm.get(CEO));
		}
	}
}
