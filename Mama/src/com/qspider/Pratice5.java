package com.qspider;

import java.io.File;
import java.io.IOException;

public class Pratice5 {
	public static void main(String[] args) throws IOException {
		File ref=new File("C:/PAVAN/hari.pdf");
		boolean flag = ref.exists();
		System.out.println(flag);
		if(flag==false) {
			ref.createNewFile();
			System.out.println("Folder Created");
		}
		else
			System.out.println("Already Created");
	}
}
