import java.util.Scanner;

class evenodd {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a;

        System.out.println("Enter 1st number:--");
        a = in.nextInt();
        if (a % 2 == 0) {
            System.out.println("EVEN NUMBER");
        } else {
            System.out.println("ODD NUMBER");
        }
    }
}