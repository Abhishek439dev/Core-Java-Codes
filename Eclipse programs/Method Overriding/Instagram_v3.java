package com;

public class Instagram_v3 extends Instagram_v2{

	@Override
	void upload() {     //upload method is overrided again.
		super.upload();
		System.out.println("In the latest version you can upload Videos as well along with images and GIFs");
	}
	
	@Override
	void DM () {       //DM method is overrided.
		super.DM();
		System.out.println("In the latest version you can now send Images as well to your friends.");
	}
	
	void Story() {    //A new method 'Story' is created.
		System.out.println("In the latest version you can also upload stories.");
	}
}
