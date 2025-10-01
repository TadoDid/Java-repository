import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //madlib game
        Scanner scanner = new Scanner(System.in);

        String adj1;
        String noun1;
        String adj2;
        String verb;
        String adj3;

        System.out.println("Enter an adjective (description): ");
        adj1 = scanner.nextLine();
        System.out.println("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adj2 = scanner.nextLine();
        System.out.println("Enter a verb end with -ing(action)");
        verb = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adj3 = scanner.nextLine();

        System.out.println("Today l went to a " + adj1 + " zoo.");
        System.out.println("In a exhibit l saw a " + noun1 + ".");
        System.out.println(noun1+ " was " +adj2+ " and " +verb+ "!");
        System.out.println("I was " +adj3+ "!");

        scanner.close();

        }
    }
