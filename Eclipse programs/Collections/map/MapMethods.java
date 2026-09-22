package map;

import java.util.HashMap;

public class MapMethods {

	public static void main(String[] args) {
		
		HashMap h = new HashMap();
		
		h.put(10, "Tom");
		h.put(10.5, 'F');
		h.put("jack", 'M');
		h.put(true, 34);
		h.put("Jean", "Eren");
		
		
		System.out.println(h.get(true));
		System.out.println(h.get(10));
		System.out.println(h.get(100));
		
		System.out.println(h.containsKey(10.5));
		System.out.println(h.containsKey(80));
		
		System.out.println(h.containsValue("tom"));
		System.out.println(h.containsValue("Eren"));
		
		System.out.println(h);
		h.remove("jack");
		System.out.println(h);
		
		System.out.println(h.isEmpty());
		h.clear();
		System.out.println(h.isEmpty());
	}
}
