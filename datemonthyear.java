import java.util.Scanner;

class datetimeyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = sc.nextInt();
        System.out.println("Enter month:");
        int month = sc.nextInt();
        System.out.println("Enter day:");
        int date = sc.nextInt();
        System.out.println(year + "/" + month + "/" + date);
        switch (month) {
            case 1:
                System.out.println(date + "th " + " jan" + "" + year);
                break;
            case 2:
                System.out.println(date + "th " + " feb" + " " + year);
                break;
            case 3:
                System.out.println(date + "th " + " march" + " " + year);
                break;
            case 4:
                System.out.println(date + "th " + "april" + " " + year);
                break;
            case 5:
                System.out.println(date + "th " + "may" + " " + year);
                break;
            case 6:
                System.out.println(date + "th " + "june" + " " + year);
                break;
            case 7:
                System.out.println(date + "th " + "july" + "" + year);
                break;
            case 8:
                System.out.println(date + "th " + "aug" + " " + year);
                break;
            case 9:
                System.out.println(date + "th " + "sep" + " " + year);
                break;
            case 10:
                System.out.println(date + "th " + "oct" + " " + year);
                break;
            case 11:
                System.out.println(date + "th " + "nov" + " " + year);
                break;
            case 12:
                System.out.println(date + "th " + "december" + " " + year);
                break;
            default:

                System.out.println("INVALID DATE?TIME?YEAR ENTERED");
                break;

        }
    }
}