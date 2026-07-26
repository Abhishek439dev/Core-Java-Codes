package com;

public class Instagram_v3 extends Instagram_v2{

	@Override
	void upload() {
		super.upload();
		System.out.println("In the latest version you can upload Videos as well along with images and GIFs");
	}
	
	@Override
	void DM () {
		super.DM();
		System.out.println("In the latest version you can now send Images as well to your friends.");
	}
	
	void Story() {
		System.out.println("In the latest version you can also upload stories.");
	}
}
