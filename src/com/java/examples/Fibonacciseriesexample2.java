package com.java.examples;
 import java.util.Scanner;
public class Fibonacciseriesexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner s=new Scanner(System.in);
  int a=0,b=1,c=2 ,n;
  System.out.println("Enter the Maximum Values:");
  n=s.nextInt();
  while(c<=n)
  {
  System.out.println(c);
	 a=b;
	 b=c;
	 c=a+b; 
  }
	}

}
