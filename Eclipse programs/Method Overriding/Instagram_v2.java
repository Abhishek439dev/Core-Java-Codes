package com;

public class Instagram_v2 extends Instagram_v1{     //Is-A relationship is necessary for method overriding.

	@Override
	void upload() {     //upload method is overriden 
		super.upload();
		System.out.println("You can now upload Images and GIFs as well in the new version.");
	}
	
	void DM() {        //A new method 'DM' is created.
		System.out.println("In this version you can send messages to your friends.");
	}
}
