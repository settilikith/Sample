package test2;
//method overloading
public class APP {
	public static void login(String email)
	{
	      System.out.println("login through the email");
	}
	public static void login(long mobileno)
	{
		System.out.println(mobileno);
	}

	public static void main(String[] args) {
		String email="likith@gmail.com";
		long mobileno=989078988;
		login(mobileno);
		login(email);

	}

}
