import java.util.Scanner;
public class Table{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:-");
		int n= in.nextInt();
		for(int i=0; i<=10; i++)
		{
			System.out.println(n+"x"+i+"="+i*n);
		}
	}

}