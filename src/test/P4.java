package test;

public class P4 {

	public static void main(String[] args) {
	   int n=5;
	   for(int i=1;i<=n;i++)
	   {
		   for(int j=1;j<=n;j++)
		   {
			   if(i==1&&i<=(n+1)/2||i==n&&i>=(n+1)/2||i==j&&j<=(n+1)/2||i+j==(n+1)&&j>=(n+1)/2)
				   System.out.print("* ");
			   else
				   System.out.print("  ");
		   }
		   System.out.println();
	   }
		// TODO Auto-generated method stub

	}

}
