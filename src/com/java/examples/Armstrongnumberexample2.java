package com.java.examples;
import java.util.Scanner;
public class Armstrongnumberexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner s=new Scanner(System.in);
   System.out.println("Enter any number");
   int n=s.nextInt();
   int temp,r=0;
   int sum=0;
  temp=n;
   while(n!=0)
   {
  r=n%10;
 sum=sum+(r*r*r);
   n=n/10;
   }
   if(temp==sum)
   {
 System.out.println("Armstrong number");
   }
   else
   {
 System.out.println("Not Armstrong number");
   }
  	}
}
