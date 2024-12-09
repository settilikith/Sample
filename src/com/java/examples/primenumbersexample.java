		package com.java.examples;

public class primenumbersexample

{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
         int x=5;
		  int count=0;
         if(x>1) 
 {
       for(int i=1;i<=x;i++)
  {
	  if(x%i==0)
	  
	   count++;
	 
  }
	  if(count==2)
	  {
		  System.out.println("Given number is prime number");
        }
	  
   
  
        else
 {
	 System.out.println("Given number is not prime number");
  }
 }
	}
}


 
