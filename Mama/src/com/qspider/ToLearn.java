package com.qspider;

public class ToLearn {
	public static void main(String[] args) {
		int[] a= {28,121,145,21};
		
		for(int i=0;i<a.length;i++)
		{
			if(isStrong(a[i]))
				System.out.println(a[i]);
		}
		
	}
	public static boolean isStrong(int n)
	{
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			int fact=isFactorial(rem);
			sum=sum+fact;
			n=n/10;
			
		}
		return sum==temp;
		
	}
	public static int isFactorial(int n)
	{
		int fact=1;
		for(int i=n;i>=2;i--)
		{
			fact=fact*n;
		}
		return fact;
	}
}
