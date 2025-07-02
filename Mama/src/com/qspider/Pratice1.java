package com.qspider;

import java.io.File;

public class Pratice1 {
	public static void main(String[] args) {
		File ref=new File("C:/Pavan");
		boolean flag=ref.exists();
		System.out.println(flag);
		if(flag==false)
		{
			ref.mkdir();
			System.out.println("Folder is Created");
		}
		else
			System.out.println("Already created");
		
	}
}
