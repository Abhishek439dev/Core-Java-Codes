package map;

import java.util.LinkedHashMap; //Importing LinkedHashMap to use it.
import java.util.Set;  //Importing Set to convert and store the Keys as Set.

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		//Creating a LInkedHashMap with String type keys and Double type values.
		LinkedHashMap<String, Double> lhm = new LinkedHashMap<String, Double>();
		
		//Adding Key value pairs.
		lhm.put("Deepender", 2023.34);
		lhm.put("Sam", 5000.35);
		lhm.put("Satya", 4509.34);
		lhm.put("Sundar", 4536.56);
		lhm.put("Tim", 7934.34);
		
		//LinkedHashMap also allow one null Key(duplicate keys not allowed) and multiple null values(duplicate values allowed).
		lhm.put(null, null);
		lhm.put("Elon", null);
		lhm.put("Bezos", null);
		
		//Converting the keys into a Set.
		Set<String> keys = lhm.keySet();

		//Traversing through the Set of keys.
		for(String CEO : keys) {
			System.out.println("Salary of CEO "+CEO+" is "+lhm.get(CEO));
		}
	}
}
