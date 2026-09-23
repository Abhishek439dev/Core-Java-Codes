package map;

import java.util.Set;     //Imported Set class to convert and store the keys as set.
import java.util.TreeMap; //Imported TreeMap class to use it.

public class TreeMapDemo {

	public static void main(String[] args) {
		//Creating a TreeMap with keys type as String and Value type is Double.
		TreeMap<String, Double> t = new TreeMap<String, Double>();

		//adding key-value pairs to the TreeMap.
		t.put("Apple", 230.45);
		t.put("Orange", 80.99);
		t.put("Banana", 55.35);
		t.put("Grapes", 70.45);
		t.put("Kiwi", 300.67);
		
		//Duplicate values -> allowed but not keys.
		t.put("Stawberry", 300.67);
		
		//multiple null values are allowed but not even one duplicate key as they are necessary for comparison.
		t.put("Peaches", null);
		t.put("Watermelon", null);
		
		//converting the TreeMap keys into Set.
		Set<String>keys =  t.keySet();

		//Traversing through the Set using for-each loop.
		for(String fruit : keys) {
			System.out.println(fruit+" is "+t.get(fruit)+" rupees per kg");
		}
		
		System.out.println("===========================");

		//Creating another TreeMap with Double type keys and String type Values.
		TreeMap<Double, String> t2 = new TreeMap<Double, String>();
	  	//adding key-value pairs to the TreeMap.
	  	t2.put(230.45, "Apple");
		t2.put(80.99, "Orange");
		t2.put(55.35, "Banana");
		
		t2.put(90.56, null);
		//converting the TreeMap keys into Set.
		Set<Double> keys2 =  t2.keySet();

		//Traversing through the Set using for-each loop.
		for(double cost : keys2) {
			System.out.println(cost+" is the cost of "+t2.get(cost)+" per kg");
		}
	}
	
	  	
}
