package pattern;

import java.util.Scanner;

public class pa2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||i+j==(n+1)/2+1||i-j==n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}