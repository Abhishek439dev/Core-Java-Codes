package map;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hs  = new HashMap<Integer, String>();
		
		hs.put(102, "Mikasa");
		hs.put(105, "Erwin");
		hs.put(104, "Levi");
		hs.put(101, "Eren");
		hs.put(106, "Hange");
		hs.put(103, "Armin");
		
		//Duplicate keys with same values -> Not allowed(will get deleted).
		hs.put(102, "Mikasa");
		hs.put(105, "Erwin");
		
		//Duplicate values with different keys -> Allowed
		hs.put(107, "Eren"); 
		hs.put(108, "Armin");
		
		//HashMap allows one null Key and multiple null Values.
		hs.put(109, null);
		hs.put(null, null);
		hs.put(110, "Connie");
		
		Set<Integer> hsKeys = hs.keySet();
		
		for(Integer keys : hsKeys) {
			System.out.println("Cadet with Id "+keys+" is "+hs.get(keys));
		}
		
		System.out.println("========================");
		
		HashMap<String, Integer> hs2  = new HashMap<String, Integer>();
		
		hs2.put("Apple", 250);
		hs2.put("Banana", 60);
		hs2.put("Mango", 70);
		hs2.put("Pomegranate", 220);
		hs2.put("Orange", 80);
		
		//Duplicate keys with different values -> Override the previous values.
		hs2.put("Mango", 50);
		hs2.put("Pomegranate", 250);
		
		Set<String> hsKeys2 = hs2.keySet();
		
		for(String keys : hsKeys2) {
			System.out.println(keys+" is "+hs2.get(keys)+" ruppees per kg.");
		}
	}
	
}
