package pattern;

public class Example {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||i==n||j==n||i==1||i==j||i+j==n+1)
					{
					  System.out.print("* ");
					}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
