package com.qspider;

import java.io.File;

public class Pratice4 {
	public static void main(String[] args) {
		File ref=new File("C:/Pavan");
		boolean flag=ref.exists();
		if(flag==true)
		{
			ref.delete();
			System.out.println("Now Folder Deleted");
		}
		else
			System.out.println("Already Deleted");
	}
}
