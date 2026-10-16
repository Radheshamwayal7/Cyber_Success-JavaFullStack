
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Is the parrot talking? (true/false)");
        boolean talking = sc.nextBoolean();

        System.out.println("Enter hour (0-23):");
        int hour = sc.nextInt();

        if (talking && (hour < 7 || hour > 20)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        sc.close();
    }
}
