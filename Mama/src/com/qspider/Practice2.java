package com.qspider;

import java.io.File;
import java.io.IOException;

public class Practice2 {

	public static void main(String[] args) throws IOException {
		File ref=new File("C:/Pavan/Chuthiya.pdf");
		boolean flag=ref.exists();
		System.out.println(flag);
		if(flag==false)
		{
			ref.createNewFile();
			System.out.println("Folder is Created");
		}
		else
			System.out.println("Already created");
		
	}
}
