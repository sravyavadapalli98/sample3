package com.sample3;

import java.util.Scanner;

public class ArrayDemo 
{
	public static void main(String[] args) {
		
	
	int n,x[],i,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of element array");
	n=sc.nextInt();
	x=new int[n];
	for(i=0;i<n;i++)
	x[i]=sc.nextInt();
	for(i=0;i<n;i++)
	{
	System.out.println(x[i]);
	sum=sum+x[i];
	}
	System.out.println("sum of the array"+sum);
}
}