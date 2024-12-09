package com.java.examples;

public class panlindromenumberexample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
   int r,temp,sum=0;
   int n=454;
   temp=n;
   while(n>0)
   {
	   r=n%10;
	   sum=(sum*10)+r;
	   n=n/10;
   }
   if(temp==sum)
   {
	   System.out.println("panlidrome number");
   }
   else
   {
	   System.out.println("not panlidrome number");
   }
	}

}
