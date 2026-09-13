package list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList Al = new ArrayList();
		
		Al.add(10);
		Al.add(20);
		Al.add(30);
		Al.add(40);
		Al.add(50);
		Al.add(60);
		
		System.out.println(Al);
		
		for(int i = 0; i<Al.size(); i++) {
			System.out.println(Al.get(i));
		}
	}
}
