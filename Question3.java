import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if((a >= 100 || a < 0 ) && (b >= 100 || b < 0) ) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        sc.close();
    }
}
