package com.qspider;

public class Pattern {
	public static void main(String[] args) {
		int n=7,st=n/2+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=st;j++)
			{
				System.out.print("* ");
			}
			if(i<=n/2)
				st--;
			else
				st++;
			
			System.out.println();
		}
	}
}
