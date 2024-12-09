package com.java.examples;
import java.util.Scanner;
public class Primenumberexample2 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	int n,count=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any number");
	n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}			
	}
	if(count==2)
	{
		System.out.println("Given number is prime number");
	}
	else
	{
		System.out.println("Given number is  Composite number");
	}
	}
}






