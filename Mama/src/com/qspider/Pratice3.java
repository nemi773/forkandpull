package com.qspider;

import java.io.File;

public class Pratice3 {
	public static void main(String[] args) {
		File ref=new File("C:/Pavan/Chuthiya.pdf");
		boolean flag=ref.exists();
		System.out.println(flag);
		if(flag==true)
		{
			ref.delete();
			System.out.println("Folder is deleted");
		}
		else
			System.out.println("Already deleted");
		
	}
}
