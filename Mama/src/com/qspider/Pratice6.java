package com.qspider;

import java.io.File;

public class Pratice6 {
	public static void main(String[] args) {
		File ref=new File("C:/PAVAN/pavan.pdf");
		boolean flag = ref.exists();
		System.out.println(flag);
		if(flag==true)
		{
			long x = ref.length();
			System.out.println(x);
		     String y = ref.getAbsolutePath();
		     System.out.println(y);
		}
	}
}
