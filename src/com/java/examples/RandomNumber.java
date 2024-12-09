package com.java.examples;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Random r=new Random();
  System.out.println("Enter any Number");
  int n=r.nextInt();
  System.out.println("Generated the number is:"+ n);
	}

}
