import java.util.Scanner;

class Addition{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int a;
		int b,c;
		
		System.out.println("Enter 1st number:--");
		a=in.nextInt();
		System.out.println("Enter 2nd number:--");
        b=in.nextInt();
	    c=a+b;
	System.out.println("ADDITION OF TWO NUMBERS ARE= "+c);
	
	}
		
	
}