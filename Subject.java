import java.util.Scanner;
public class Subject{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int a,b,c,d;
		System.out.println(" Enter the first subject marks:-");
		a=in.nextInt();
		System.out.println(" Enter the second subject marks:-");
		b=in.nextInt();
		System.out.println(" Enter the third subject marks:-");
		c=in.nextInt();
		
		d=(a+b+c)/3;
		System.out.println(" Total average of all subjects  are:"+d);
		
		if(d<=22)
		{
			System.out.println("FAIL");
		}
		else
		{
			System.out.println("PASS");
		}
		
		
	}
}