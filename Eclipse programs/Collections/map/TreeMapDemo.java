package map;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<String, Double> t = new TreeMap<String, Double>();
		
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
		
		
		Set<String>keys =  t.keySet();
		
		for(String fruit : keys) {
			System.out.println(fruit+" is "+t.get(fruit)+" rupees per kg");
		}
		
		System.out.println("===========================");
		
		TreeMap<Double, String> t2 = new TreeMap<Double, String>();
	  	
	  	t2.put(230.45, "Apple");
		t2.put(80.99, "Orange");
		t2.put(55.35, "Banana");
		
		t2.put(90.56, null);
		
		Set<Double> keys2 =  t2.keySet();
		
		for(double cost : keys2) {
			System.out.println(cost+" is the cost of "+t2.get(cost)+" per kg");
		}
	}
	
	  	
}
