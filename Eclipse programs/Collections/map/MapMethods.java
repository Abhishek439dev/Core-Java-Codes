package map;
//We are applying and understanding the methods upon HashMap, so we need to import it.
import java.util.HashMap;

public class MapMethods {

	public static void main(String[] args) {
		//Creating a HashMap.
		HashMap h = new HashMap();

		//put(key, value): put() method is used to add key and value in the HashMap. The first argument is the Key and second one is the value.
		h.put(10, "Tom");
		h.put(10.5, 'F');
		h.put("jack", 'M');
		h.put(true, 34);
		h.put("Jean", "Eren");
		
		//get(key): this method is used to fetch a value based on its key.
		System.out.println(h.get(true));
		System.out.println(h.get(10));
		System.out.println(h.get(100));

		//containsKey(Key): used to check if the HashMap contains the specified Key. Returns a boolean value.
		System.out.println(h.containsKey(10.5));
		System.out.println(h.containsKey(80));

		//containsValue(value): used to check if the HashMap contains the specified Value. Returns a boolean value.
		System.out.println(h.containsValue("tom"));
		System.out.println(h.containsValue("Eren"));
		
		System.out.println(h);
		//remove(): this method removes a key value pair based on the Key specified.
		h.remove("jack");
		System.out.println(h);

		//isEmpty(): used to check if the HashSet is empty or not. Returns a boolean value.
		System.out.println(h.isEmpty());
		//clear(): this method removes all the key value pairs from the HashMap.
		h.clear();
		System.out.println(h.isEmpty());
	}
}
