import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age ;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if(ageCheck(age)){
            System.out.println("You may sign in");
        }else{
            System.out.println("You must be 18+ to sign in");
        }

        System.out.println(square(3));




    }
    static double square(int num){
        return num*num;
    }
    static boolean ageCheck(int age){
        if(age>=18){
            return true;
        }
        else {
            return false;
        }
    }
}