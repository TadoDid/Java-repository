import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int number;
        double n2;
        boolean h;

        number = random.nextInt(1,5);
        n2 = random.nextDouble();
        h = random.nextBoolean();
        System.out.println(number);
        System.out.println(n2);
        System.out.println(h);


    }
}