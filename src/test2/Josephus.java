package test2;

import java.util.Scanner;

public class Josephus {
	static int jos(int n,int r)
	{
	   for(;n>=1;n--)
	   {
		   n=n+r%n;
		   return 0;
	   }
	return (jos	(n,r));	
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter total member");
		int n=s.nextInt();
		System.out.println("enter killing ratio");
		int r=s.nextInt();
		int pos =jos(n,r);
		pos++;
		System.out.println(pos);
		// TODO Auto-generated method stub

	}

}
