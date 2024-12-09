package com.java.examples;

import java.util.Scanner;

public class Panlindromenumberexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s=new Scanner(System.in);
 System.out.println("Enter any number");
 int num=s.nextInt();
 int orgnum=num;
 int rev=0;
 while(num>0)
 {
	int r=num%10;
	rev= (rev*10)+r;
	num=num/10;
 }
 if(orgnum==rev)
 {
	 System.out.println("panlindrom Number");
 }
 else
 {
	 System.out.println("not panlindrom Number");
 }
}
}
