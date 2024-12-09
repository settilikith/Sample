package com.java.examples;
import java.util.Scanner;
public class FactorialNumberexample2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
  Scanner s=new Scanner(System.in);
  System.out.println("Enter any number");
  int n=s.nextInt();
   int f=1;
  for(int i=1;i<=n;i++)
  {
  f=f*i;
  }
  System.out.println("Factorial of Number:"+f);
  }
	}


