import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (((a >= 30 && a <= 40) || (a >= 40 && a <= 50)) &&
            ((b >= 30 && b <= 40) || (b >= 40 && b <= 50))) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        sc.close();
    }
}
