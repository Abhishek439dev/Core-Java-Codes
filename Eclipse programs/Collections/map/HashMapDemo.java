package map;

import java.util.HashMap; //importing HashMap class to use it.
import java.util.Set; //importing Set to convert and store the Keys as a Set.

public class HashMapDemo {

	public static void main(String[] args) {
		//Creating a HashMap with Keys as Integers and Values as String.
		HashMap<Integer, String> hs  = new HashMap<Integer, String>();

		//Adding keys and Values to the HashMap.
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
		
		//HashMap allows one null Key(as duplicate keys are not allowed) and multiple null Values(duplicate values allowed).
		hs.put(109, null);
		hs.put(null, null);
		hs.put(110, "Connie");

		//Creating a set of the keys present in the HashMap to traverse through it.
		Set<Integer> hsKeys = hs.keySet();

		//traversing through the Set of keys using the for-each loop.
		for(Integer keys : hsKeys) {
			System.out.println("Cadet with Id "+keys+" is "+hs.get(keys));
		}
		
		System.out.println("========================");

		//Creating another HashMap with String keys and Integer values.
		HashMap<String, Integer> hs2  = new HashMap<String, Integer>();

		//adding key value pairs.
		hs2.put("Apple", 250);
		hs2.put("Banana", 60);
		hs2.put("Mango", 70);
		hs2.put("Pomegranate", 220);
		hs2.put("Orange", 80);
		
		//Duplicate keys with different values -> Override the previous values.
		hs2.put("Mango", 50);
		hs2.put("Pomegranate", 250);

		//Creating Set of the keys.
		Set<String> hsKeys2 = hs2.keySet();

		//Traversing through the set.
		for(String keys : hsKeys2) {
			System.out.println(keys+" is "+hs2.get(keys)+" ruppees per kg.");
		}
	}
	
}
