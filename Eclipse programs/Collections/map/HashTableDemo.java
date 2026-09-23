package map;

import java.util.Hashtable; //importing Hashtable class to use it.
import java.util.Set;  //importing Set to convert and store the keys as Set.

public class HashTableDemo {

	public static void main(String[] args) {
		//Creating a Hashtable with Integer type keys and String type values.
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		//Adding key value pairs.
		//Hashtable does not allow any null keys or values.
		ht.put(10, "Crysta");
		ht.put(9, "Connie");
		ht.put(7, "jean");
		ht.put(4, "Eren");
		ht.put(1, "Levi");
		ht.put(3, "Erwin");
		ht.put(2, "Mikasa");
		ht.put(5, "Hange");
		ht.put(6, "Sasha");
		ht.put(8, "Ymir");
		
		//Duplicate values are allowed but not keys.
		ht.put(11, "Sasha");
		ht.put(12, "Ymir");

		//Converting the Keys to a set.
		Set<Integer> keyCadets = ht.keySet();

		//Traversing through the Set using for each loop.
		for(Integer Scout : keyCadets) {
			System.out.println(ht.get(Scout)+" is on number "+Scout);
		}
	}
}
