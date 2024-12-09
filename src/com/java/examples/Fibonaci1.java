package com.java.examples;
import java.util.Scanner;
public class Fibonaci1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("enter a value");
        int n=s.nextInt();
        int a=0,b=1;
        while(n>0)
        {
        	System.out.print(a+",");
        	int c =a+b;
        	a=b;
        	b=c;
        	n--;
        }

	}

}
