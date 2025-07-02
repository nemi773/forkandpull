package com.qspider;

import java.io.File;

public class Pratice7 {

		public static void main(String[] args) {
			File ref=new File("C:/PAVAN");
			boolean flag = ref.exists();
			System.out.println(flag);
			if(flag==true)
			{
				String[] arr = ref.list();
				for(int i=0;i<arr.length;i++)
				{
					File obj=new File(ref,arr[i]);
					if(obj.isDirectory())
						System.out.println(arr[i]);
					else
						System.out.println("No Directory");
				}
			}
	}
}
