
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean negative = sc.nextBoolean();

        if ((a < 0 && b > 0 || a > 0 && b < 0) && !negative) {
            System.out.println(true);
        } else if (negative && a < 0 && b < 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        sc.close();
    }
}
