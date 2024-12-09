package com.java.examples;

public class Armstrongnumberexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=153,temp,sum=0,rem=0;
  temp=n;
  while(n!=0)
  {
	rem=n%10;
	sum=sum+(rem*rem*rem);
	n=n/10;
  }
  if(temp==sum)
  {
	  System.out.println("Armstrong number");
  }
  else
  {
	  System.out.println("Not an Armstrong number");
  }
	}

}
