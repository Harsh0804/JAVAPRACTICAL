import java.util.Scanner;
class larsmall3v{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 1st number:--");
		a=in.nextInt();
		System.out.println("Enter 2nd number:--");
        b=in.nextInt();
		System.out.println("Enter 3nd number:--");
        c=in.nextInt();
		System.out.println("Larger number");
		
		if (a>b){
			System.out.println(a);
		}
		else if (a>c){
			System.out.println(b);
		}
		else{
			System.out.println(c);
			
		}
		System.out.println("Smallest number");
		
		if (b>a){
			System.out.println(a);
		}
		else if (b>c){
			System.out.println(b);
		}
		else{
			System.out.println(c);
			
		}
		
	}
}