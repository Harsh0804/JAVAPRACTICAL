import java.util.Scanner;

class divby25{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int a;
		
		
		System.out.println("Enter 1st number:--");
		a=in.nextInt();
		if(a%2==0 || a%5==0){
			System.out.println("A IS DIVISIBLE BY 2 AND 5");
		}
		else{
			System.out.println("A IS  NOT DIVISIBLE BY 2 AND 5");
		}
	}
}