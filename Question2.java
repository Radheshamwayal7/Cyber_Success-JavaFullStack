import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= 10 && a <= 20 && b >= 10 && b <= 20) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        sc.close();
    }
}
