import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timeCompound;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate(in %): ");
        rate  = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        timeCompound = scanner.nextInt();

        System.out.print("Enter the number of years ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timeCompound,timeCompound*years ) ;

        System.out.println("The amount after " + years +"years " +  "is: $" +amount);












        scanner.close();



    }
}
