package map;

import java.util.Hashtable;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		//Hashtable does not allow any null key or value.
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
		
		Set<Integer> keyCadets = ht.keySet();
		
		for(Integer Scout : keyCadets) {
			System.out.println(ht.get(Scout)+" is on number "+Scout);
		}
	}
}
