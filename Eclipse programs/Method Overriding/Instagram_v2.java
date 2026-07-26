package com;

public class Instagram_v2 extends Instagram_v1{

	@Override
	void upload() {
		super.upload();
		System.out.println("You can now upload Images and GIFs as well in the new version.");
	}
	
	void DM() {
		System.out.println("In this version you can send messages to your friends.");
	}
}
