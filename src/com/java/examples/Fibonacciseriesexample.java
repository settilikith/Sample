package com.java.examples;

public class Fibonacciseriesexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n1=0,n2=1,n3=2,count=10;
  System.out.println(n1+""+n2);
  for(int i=1;i<count;i++)
  {
	  System.out.println(n3);
	  n1=n2;
	  n2=n3;
	  n3=n1+n2;
  }
	}

}
