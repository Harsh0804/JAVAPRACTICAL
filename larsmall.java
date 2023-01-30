import java.util.Scanner;

class larsmall{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int a,b;
		System.out.println("Enter 1st number:--");
		a=in.nextInt();
		System.out.println("Enter 2nd number:--");
        b=in.nextInt();
		System.out.println("Larger number");
		
		if (a>b){
			System.out.println(a);
		}
		else{
			System.out.println(b);
		}
		System.out.println("Smallest number");
		if (b>a){
			System.out.println(a);
		}
		else{
			System.out.println(b);
		}
	}

}